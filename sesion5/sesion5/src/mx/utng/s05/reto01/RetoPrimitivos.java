//Cynthia Janeth Granados Estrada
//GDS0624
package mx.utng.s05.reto01;

public class RetoPrimitivos {
    public static void main(String[] args) {
        //Todos los tipo de datos primitivos e imprimir su valor minimo y valor maximo.
        //Utilizando en una sola instruccion la funcion printf
        //Datos primitivos: (byte, short, int, long, char, boolean, float, double)
        byte valorByte = Byte.MAX_VALUE;
        byte valorByte2 = Byte.MIN_VALUE;
        System.out.printf("El valor maximo del byte es: %s, minimo: %s%n", valorByte, valorByte2);

        short valorShort = Short.MAX_VALUE;
        short valorShort2 = Short.MIN_VALUE;
        System.out.printf("El valor maximo del short es: %s, minimo: %s%n", valorShort,valorShort2);

        int valorInt = Integer.MAX_VALUE;
        int valorInt2 = Integer.MIN_VALUE;
        System.out.printf("El valor maximo del entero es: %s, minimo: %s%n", valorInt,valorInt2);

        long valorLong = Long.MAX_VALUE;
        long valorLong2 = Long.MIN_VALUE;
        System.out.printf("El valor maximo del entero largo es: %s, minimo: %s%n", valorLong,valorLong2);

        float valorFloat = Float.MAX_VALUE;
        float valorFloat2 = Float.MIN_VALUE;
        System.out.printf("El valor maximo del float es: %s, minimo: %s%n",valorFloat,valorFloat2);

        double valorDouble = Double.MAX_VALUE;
        double valorDouble2 = Double.MAX_VALUE;
        System.out.printf("El valor maximo del double es: %s, minimo: %s%n",valorDouble,valorDouble2);
    }
}
