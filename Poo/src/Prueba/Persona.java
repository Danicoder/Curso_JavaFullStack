package Prueba;

import java.time.LocalDate;

public class Persona {
	//atributos
	
		String nombre;
		String apellido;
		String dni;
		String telefono;
		LocalDate fechaNacimiento;
		
		//constructores = construir personas
		
		public Persona(String nombre, String apellido, String dni, String telefono, LocalDate fechaNacimiento) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.dni = dni;
			this.telefono = telefono;
			this.fechaNacimiento = fechaNacimiento;
		}
		
		//Getters and Setters
		
		public Persona() {
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public LocalDate getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(LocalDate fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}
		
		// Mostrar datos
		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono=" + telefono
					+ ", fechaNacimiento=" + fechaNacimiento + "]";
		}
}
