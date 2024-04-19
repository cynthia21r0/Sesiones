package mx.utng.sesion4;

import java.util.Scanner;

public class Lector {
    private Scanner scanner; //= new Scanner(System.in);

    public Lector (){
        scanner = new Scanner(System.in);
    }

    //Método muestra una cadena dada como parametro
    public void muestraMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    //Leer a partir del Scanner
    public String leerEntrada() {
        return scanner.nextLine();
    }

    public void muestraMensaje(String mensaje, String dato) {
        System.out.printf("\t Este es el texto: %s %s \n\n\n ", mensaje,dato);
    }
}