import { Component, OnInit } from '@angular/core';
import { BackendService } from '../services/backend.service';
import Swal from 'sweetalert2';
import { registerLocaleData } from '@angular/common';
import localeEs from '@angular/common/locales/es';

@Component({
  selector: 'app-listado-equipos',
  templateUrl: './listado-equipos.component.html',
  styleUrls: ['./listado-equipos.component.css'],
})
export class ListadoEquiposComponent implements OnInit {
  equipos: any;

  constructor(private backend: BackendService) {}

  ngOnInit(): void {
    this.backend.getEquipos().subscribe((equipos) => {
      this.getEquipos();
    });
    registerLocaleData(localeEs);
    this.getEquipos();
  }
  //ordena por nombre
  getEquipos() {
    this.backend.getEquipos().subscribe((equipos) => {
      this.equipos = equipos;
      this.equipos.sort((a: any, b: any) => a.nombre.localeCompare(b.nombre));
      console.log(this.equipos);
    });
  }
  esImagen(nombre: string) {
    return nombre.startsWith('data:image/png;base64');
  }
  deleteEquipo(equipo: any) {
    this.backend.deleteEquipos(equipo.id).subscribe(() => {
      Swal.fire({
        icon: 'question',
        title: '¿Estás seguro?',
        showCancelButton: true,
        cancelButtonText: 'Cancelar',
      }).then((result) => {
        if (result.isConfirmed) {
          this.backend.deleteEquipos(equipo.id).subscribe(() => {
            this.getEquipos();
            Swal.fire({
              icon: 'success',
              title: `El jugador '${equipo.nombre}' se ha borrado correctamente`,
            });
          });
        }
      });
    });
  }
}
