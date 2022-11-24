import { Component, OnInit } from '@angular/core';
import Swal from 'sweetalert2';
import { BackendService } from '../services/backend.service';

@Component({
  selector: 'app-listado-jugadores',
  templateUrl: './listado-jugadores.component.html',
  styleUrls: ['./listado-jugadores.component.css']
})
export class ListadoJugadoresComponent implements OnInit {

  jugadores:any;

  constructor(private backend:BackendService) { }

  ngOnInit(): void {
      this.getjugadores();
  }
  //ordena por nombre
  getjugadores(){
    this.backend.getJugadores().subscribe((jugadores) => {
      this.jugadores = jugadores;
      this.jugadores.sort((a: any, b: any) => a.numero - b.numero);
      console.log(this.jugadores);
    })
  }

  deleteJugadores(jugador:any){
    this.backend.deleteJugadores(jugador.id).subscribe(() =>{
      Swal.fire({
        icon: 'success',
        title: 'Registro borrado',
        text: `El jugador ${jugador.nombre} se ha borrado correctamente`
      }).then(() => {this.getjugadores();})
    });
  }

}
