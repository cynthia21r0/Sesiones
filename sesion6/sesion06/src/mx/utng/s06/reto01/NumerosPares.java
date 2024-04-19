//Cynthia Janeth Granados Estrada
//GDS0624
package mx.utng.s06.reto01;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        //Utilizando el modulo poner todos los numeros 
        //pares que hay en un rango dado por el usuario
        //inicio, fin, n
        //ciclo for o while o do while, if

        Scanner s = new Scanner(System.in);
        System.out.print("Teclee desde que numero quiere iniciar: ");
        int start = s.nextInt();
        System.out.println("");
        System.out.print("Teclee hasta que numero quiere terminar: ");
        int end = s.nextInt();
        s.close();

        for (int i = start; i<=end; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
}
