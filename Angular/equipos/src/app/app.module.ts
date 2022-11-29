import { HttpClientModule } from '@angular/common/http';
import { LOCALE_ID, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { FormsModule } from '@angular/forms';
import { Route, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { FormularioEquipoComponent } from './formulario-equipo/formulario-equipo.component';
import { ListadoEquiposComponent } from './listado-equipos/listado-equipos.component';
import { FormularioJugadorComponent } from './formulario-jugador/formulario-jugador.component';
import { ListadoJugadoresComponent } from './listado-jugadores/listado-jugadores.component';
import { ImageCropperModule } from 'ngx-image-cropper';

//para el navegador
const APP_ROUTES: Route[] = [
  { path: '', component: ListadoEquiposComponent },//si no encuetra nada muestra la lista de equipos
  { path: 'listado-equipos', component: ListadoEquiposComponent },
  { path: 'insertar-equipo', component: FormularioEquipoComponent },
  { path: 'listado-jugador', component: ListadoJugadoresComponent },
  { path: 'insertar-jugador', component: FormularioJugadorComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    ListadoEquiposComponent,
    FormularioEquipoComponent,
    FormularioJugadorComponent,
    ListadoJugadoresComponent,
  ],
  imports: [
    RouterModule.forRoot(APP_ROUTES, { initialNavigation: 'enabledBlocking', onSameUrlNavigation: 'reload' }),
    BrowserModule,
    HttpClientModule,
    FormsModule,
    ImageCropperModule],
  providers: [{ provide: LOCALE_ID, useValue: 'es-ES' }],
  bootstrap: [AppComponent],
})
export class AppModule {}
