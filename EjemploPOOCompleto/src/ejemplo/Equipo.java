package ejemplo;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private List<Jugador> ListJugadores;

    public Equipo() {
        new ArrayList<Jugador>();
    }
    public void addJugador(Jugador Jugador){
        if(Jugador != null)
            ListJugadores.add(Jugador);
    }
    //Devuelve la cantidad de jugadores que hay
    public int getNumJugadores(){
        return ListJugadores.size();
    }
    //Devuelve el jugador de esa posición de la lista. Si no existe devuelve null
    public Jugador getJugador(int pos){
        if(pos >= 0 && pos < ListJugadores.size())
            return ListJugadores.get(pos);
        return null;
    }
    //Borra el jugador de esa posición (si existe)
    public void deleteJugador(int Position){
        if(Position >= 0 && Position < ListJugadores.size())
            ListJugadores.remove(Position);
    }
    //Devuelve la suma de los sueldos de los jugadores del equipo
    public double totalSueldos() {
        double total = 0;
        for (Jugador jugador : ListJugadores) {
            total += jugador.getSueldo();
        }
        return total;
    }
}
