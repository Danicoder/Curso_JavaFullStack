package ejemplo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    static Scanner sc;
    static List<Coche> coches = new ArrayList<Coche>();
    
    public static void ejemploPersonas() {
        Persona vacia = new Persona();  // Llama al constructor sin parámetros
        Persona fran = new Persona("Fran","García","111X","666-666-666",LocalDate.parse("1976-07-27"));
        Persona dani = new Persona("Dani","García","222X","666-666-667",LocalDate.of(1979, 3, 26));
        Persona joven = new Persona("Joven","García","222X","666-666-667",LocalDate.of(2020, 3, 26));

        System.out.println(fran);  // Llama al método toString
        
        vacia.setNombre("Consuelo");
        vacia.setApellido("López");
        
        //System.out.println(vacia);
        System.out.println("Nombre de vacia: " + vacia.getNombre());
        System.out.println("Apellido de vacia: " + vacia.getApellido());
        if(fran.esMayorEdad())
            System.out.println("Fran es mayor edad");
        else
            System.out.println("Fran no es mayor de edad");
        if(joven.esMayorEdad())
            System.out.println("Joven es mayor edad");
        else
            System.out.println("Joven no es mayor de edad");
    }
    
    public static void ejemplosCoches() {
        
        Coche vacio = new Coche();  // crea un coche usando el constructor vacio
        Coche todosParametros = new Coche("0000AAA", "Seat", "Panda", 90, -80000);
        System.out.println(todosParametros + "\nKilómetros: " + todosParametros.getKms());
        Coche tresParametros = new Coche("1111BBB","BMW", "Z3");
        Coche copia = new Coche(todosParametros);  // usa el constructor de copia
        
        System.out.println(todosParametros.getMatricula());  // Uso del get 0000AAA
        todosParametros.setMatricula("1234ABC");  // Uso del set, le cambio la matrícula
        System.out.println(todosParametros.getMatricula());  // 1234ABC
        System.out.println(copia.getMatricula());  // 0000AAA
        tresParametros.setMatricula("3456DFGaaaaaaaaaaaa");
        System.out.println(tresParametros.getMatricula());
        tresParametros.setMatricula("1111BBBaaaaaaaaaaaabbbbbbbbb");
        System.out.println(tresParametros.getMatricula());
        todosParametros.setKms(-40000);
        System.out.println(todosParametros.getKms());
        System.out.println(todosParametros);  // Llama al toString del coche
        if(todosParametros.equals(tresParametros)) { // comprueba si son el mismo coche por el criterio que hayamos puesto en el equals
            System.out.println("son el mismo coche");
        }else {
            System.out.println("Son coches distintos");
        }
        todosParametros.setMatricula("1111BBB");
        if(todosParametros.equals(tresParametros)) { // comprueba si son el mismo coche por el criterio que hayamos puesto en el equals
            System.out.println("son el mismo coche");
        }else {
            System.out.println("Son coches distintos");
        }
        System.out.println(vacio);
        System.out.println(vacio.estado());  // estado de vacio
        System.out.println(todosParametros.estado());
        if(vacio.rodado()) {
            System.out.println("El coche está en condiciones de uso");
        } else {
            System.out.println("El coche no ha sido probado suficientemente");
        }
        
    }

    
    public static void darAlta() {
        System.out.println("Introduzca la matricula:");
        String matricula = sc.nextLine();
        System.out.println("Introduzca la marca:");
        String marca = sc.nextLine();
        System.out.println("Introduzca el modelo:");
        String modelo = sc.nextLine();
        System.out.println("Introduzca el Año:");
        int anyo = Integer.parseInt(sc.nextLine());
        System.out.println("Introduzca los kilómetros:");
        int kms = Integer.parseInt(sc.nextLine());
        Coche alta = new Coche(matricula,marca,modelo,anyo,kms);
        coches.add(alta);
    }
    public static void darBaja() {
        System.out.println("Introduzca la matricula del coche que quiera dar de baja:");
        String matricula = sc.nextLine();
        
        //recorrer la lista (programación estructurada)
        Coche borrar = null;
        for (Coche coche : coches) {
            if(coche.getMatricula().equals(matricula))
                borrar =  new Coche(coche);
            break;
        }
        if(borrar!=null) {
            coches.remove(borrar);
            System.out.println("El primer coche encontrado, ha sido borrado");
        }
            
        //Programación funcional
        coches.removeIf(c->c.getMatricula().equals(matricula));
    }
    public static void ModificarCoche() {
        System.out.println("¿Qué dato desea modificar del coche?");
        String datoAmodificar = sc.nextLine();            
    }
    
    public static void menu() {
        int opcion;
        do {
            System.out.println("Menú");
            System.out.println("1. Dar de alta un coche");
            System.out.println("2. Dar de baja un coche");
            System.out.println("3. Modificar un coche");
            System.out.println("4. Número de coches rodados en la empresa");
            System.out.println("5. Mostrar coches de la empresa");
            System.out.println("0. Salir");
            System.out.println("Introduzca opción:");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
            case 1:
                darAlta();
                break;
            case 2:
                darBaja();
                break;
            case 3:
                ModificarCoche();
                break;
            case 4:
                System.out.println(Coche.contadorRodados);
                System.out.println(coches.stream().filter(c->c.rodado()==true).count());
                break;
            case 5:
                coches.forEach(e->System.out.println(e));
                break;
            case 0://sale del bucle
                break;
            default:
                break;
            }
        } while (opcion!=0);

    }
    
    public static void main(String[] args) {
        
        //ejemploPersonas();
        //ejemplosCoches();
        sc = new Scanner(System.in);
        menu();
        sc.close();
    }
}