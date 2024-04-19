package sesion18;

import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea el numero que deseas en binari: ");
        int miNumero = scanner.nextInt();
        scanner.close();
        String binario = Integer.toBinaryString(miNumero);
        System.out.printf("El número %d es en binario %s%n", miNumero, binario);
    
    }
    
}
