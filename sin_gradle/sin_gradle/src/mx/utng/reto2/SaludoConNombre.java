//Cynthia Janeth Granados Estrada
//GDS0624
package mx.utng.reto2;
import java.util.Scanner;

public class SaludoConNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea tu nombre ");
        String nombre = scanner.nextLine();
        System.out.println("Hola "+nombre+"!");
        scanner.close();
    }
    
}
