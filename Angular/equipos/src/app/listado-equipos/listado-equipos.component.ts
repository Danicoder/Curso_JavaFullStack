import { Component, OnInit } from '@angular/core';
import { BackendService } from '../services/backend.service';

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
      this.equipos = equipos;
      console.log(this.equipos);
    })
  }

}
