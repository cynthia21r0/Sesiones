package mx.utng.s06;

import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        System.out.println("Ejemplo de ciclo for");

        //Imprimimos los numeros del 1 al 10
        for (int i=1; i <=10; i++){
            System.out.println(i);
        }
        //Imprimimos los numeros de 2 en 2 hasta el 100

        for (int i=2; i <=100; i+=2){
            System.out.println(i);
        }
        //Imprimimos la table del 5
        for (int i=1; i <=10; i++){
            System.out.printf("5x%d=%d%n", i, i*5);
        }
        //Tabla del numero que me pidan
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea numero de la tabla que desea: ");
        int n = s.nextInt();
        s.close();
        for (int i=1; i <=10; i++){
            System.out.printf("%dx%d=%d%n", n, i, n*i);
        }
        //Muestra los valores de un arreglo dado
        String[] frutas = {"Mango", "Pera", "Manzana", "Melon", "Platano"};

        for (int i=0; i <frutas.length; i++){
            System.out.println(frutas[i]);
        }
        for (String fruta : frutas){
            System.out.println(fruta);
        }

        //Imprimir los numeros del 1 al 10 con el while
        System.out.println("Usando while: ");
        byte i = 0;
        while (++i<=10) {
            System.out.println(i);
 
        }
        //Usando do while
        System.out.println("Usando do while: ");
        i = 0;
        do{
            System.out.println(i);
        }while (i++ <10);
}
}