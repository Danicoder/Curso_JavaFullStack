import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

const SERVER = 'http://localhost:8080/'

@Injectable({
  providedIn: 'root'
})
export class BackendService {

  constructor(private http: HttpClient) { }

  /*Tabla de equipos*/
  getEquipos() {
    return this.http.get(`${SERVER}equipos`)
  }
  postEquipos(equipo:any){
    return this.http.post(`${SERVER}equipos`,equipo)
  }
  deleteEquipos(id:number){
    return this.http.delete(`${SERVER}equipos/${id}`)
  }
  /*Tabla de jugadores*/
  getJugadores() {
    return this.http.get(`${SERVER}jugadores`)
  }
  postJugadores(jugador:any){
    return this.http.post(`${SERVER}jugadores`,jugador)
  }
  deleteJugadores(id:number){
    return this.http.delete(`${SERVER}jugadores/${id}`)
  }
}
