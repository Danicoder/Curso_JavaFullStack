package Prueba;

import java.time.LocalDate;

public class prueba {
	//clase empieza en mayúscula 
	Persona vacia = new Persona(); //llama al contructor sin parámetros
	Persona Daniela = new Persona("Daniela","García","48764757L","642767856",LocalDate.parse("1995-04-04"));
	Persona Fran = new Persona("Daniela","García","48764757L","642767856",LocalDate.of(1995,04,04));
}
