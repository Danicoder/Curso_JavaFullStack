import { Component, OnInit } from '@angular/core';
import { BackendService } from '../services/backend.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-listado-equipos',
  templateUrl: './listado-equipos.component.html',
  styleUrls: ['./listado-equipos.component.css']
})
export class ListadoEquiposComponent implements OnInit {
  equipos:any;

  constructor(private backend:BackendService) { }

  ngOnInit(): void {
    this.backend.getEquipos().subscribe((equipos) => {
      this.getEquipos();
    })
  }
  //ordena por nombre
  getEquipos(){
    this.backend.getEquipos().subscribe((equipos) => {
      this.equipos = equipos;
      this.equipos.sort((a: any, b: any) => a.nombre.localeCompare(b.nombre));
      console.log(this.equipos);
    })
  }

  deleteEquipo(equipo:any){
    this.backend.deleteEquipos(equipo.id).subscribe(() =>{
      Swal.fire({
        icon: 'success',
        title: 'Registro borrado',
        text: `El equipo ${equipo.nombre} se ha borrado correctamente`
      }).then(() => {this.getEquipos();})
    });
  }
}
