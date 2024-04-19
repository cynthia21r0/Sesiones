//Cynthia Janeth Granados Estrada
//GDS0624
package mx.utng.s11.reto1;

import java.time.LocalDate;
import java.time.Month;

public class PruebaHerencia {
    public static void main(String[] args) {
        Programador programador = new Programador("Cynthia", (byte)18, LocalDate.of
        (2005, Month.OCTOBER, 12), 10000.00f, "Java");
    
        System.out.println("Datos del Programador: ");
        System.out.println("Nombre: "+ programador.getNombre());
        System.out.println("Edad: "+ programador.getEdad());
        System.out.println("Fecha de nacimiento: "+ programador.getFechaNacimiento());
        System.out.println("Salario: "+ programador.getSalario());
        System.out.println("Lenguaje principal: "+ programador.getLenguajePrincipal());

        DBA dba = new DBA("Beni", (byte)18, LocalDate.of
        (2005, Month.OCTOBER, 24), 20000.00f, "SQL");

        System.out.println("Datos del admin: ");
        System.out.println("Nombre: "+ dba.getNombre());
        System.out.println("Edad: "+ dba.getEdad());
        System.out.println("Fecha de nacimiento: "+ dba.getFechaNacimiento());
        System.out.println("Salario: "+ dba.getSalario());
        System.out.println("Herramientas de consulta: "+ dba.getHerramientasConsulta());
    }
    
}
