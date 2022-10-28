package ejemplo;

public class Jugador {
    
    private String nombre;
    private int edad;
    private double sueldo;

    public Jugador() {
        this.nombre = nombre;
        setEdad(edad);
        setSalario(salario);
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
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = Math.abs(edad);
    }
    public double getSueldo() {
        return Math.abs(sueldo);
    }
    public void setSueldo(double sueldo) {
        this.sueldo = Math.abs(sueldo);
    }
    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + "]";
    }
}
