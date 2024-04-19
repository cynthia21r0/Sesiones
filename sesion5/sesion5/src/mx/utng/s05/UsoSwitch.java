package mx.utng.s05;

import java.util.Scanner;

public class UsoSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea tu calificacion POO: ");
        int nota = scanner.nextInt();
        scanner.close();
        String mensaje = "";
        switch (nota) {
            case 10:
                mensaje = "Excelente";
                break;
            case 9:
            case 8:
                mensaje = "Muy bien";
                break;
            case 7:
            mensaje = "Bien hecho";
                break;
            case 6:
            mensaje = "Pasaste";
                break;
            case 5: 
            mensaje = "Mejor vuelve a cursar";
                break;
            default:
            mensaje = "Nota no valida";
                break;
        }
        System.out.println(mensaje);
    }
    
}
