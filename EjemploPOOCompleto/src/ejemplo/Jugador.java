package ejemplo;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    
    private String nombre;
    private int edad;
    private double sueldo;
    List<Jugador> ListJugadores = new ArrayList<Jugador>();

    public Jugador() {
        this.nombre = null;
        this.edad = 27;
        this.sueldo = 1000;
    }
    //constructor de copia
    public Jugador(Jugador j){
        this.nombre = j.nombre;
        this.edad = j.edad;
        this.sueldo = j.sueldo;
    }

    public Jugador(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return Math.abs(edad);
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getSueldo() {
        return Math.abs(sueldo);
    }
    public void setSueldo(double sueldo) {
        this.sueldo = Math.abs(sueldo);
    }
    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + ", ListJugadores="
                + ListJugadores + "]";
    }
}
