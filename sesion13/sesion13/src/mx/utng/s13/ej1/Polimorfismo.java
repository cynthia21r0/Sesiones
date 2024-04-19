package mx.utng.s13.ej1;

import java.time.LocalDate;
import java.time.Month;

public class Polimorfismo {
    public static void main(String[] args) {
        Profesor profe1 = new Profesor("Cynthia","Granados Estrada", "UTNG398");
        profe1.mostrarDatos();
        Profesor profe2 = new ProfesorInterino("Felipe", "Hernandez Hernandez", 
        "UTNG389", LocalDate.of(2024, Month.APRIL, 15));
        profe2.mostrarDatos();

        Persona p = new Persona("Fernando", "Lopez");
        p = new Profesor(p.getNombre(), p.getApellidos(), "UTNG399");
        p.mostrarDatos();
    }
    
}
