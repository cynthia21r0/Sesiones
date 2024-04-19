package mx.utng.s05;

public class Primitivos {
    public static void main(String[] args) {
        //Entero muy pequeño (-128 a 127)
        byte valorByte = 127;
        System.out.println("Muy pequeño: "+valorByte);

        //Entero corto (-32768 al 32767)
        short valorShort = 32767;
        System.out.println("Corto: "+valorShort);

        //Entero base (-2147483648 al 2147483647)
        int valorInt = 2147483647;
        System.out.println("Entero: "+valorInt);

        //Entero mas largo (-9223372036854775808 a 9223372036854775807)
        long valorLong = 9223372036854775807l;
        System.out.println("Long: "+valorLong);

        //Numero real tienen punto decimal esde 6 cifras despues del punto
        float valorFloat = 7.56346998766544f;
        System.out.println("Flotante: "+valorFloat);

        //Numero real con doble precision 16 cifras despues del punto
        double valorDouble = 3.51236423462142570947212;
        System.out.println("Double: "+valorDouble);

        //Valor booleano con solo dos valores posibles true/false
        boolean valorBoolean = true;

        //Primitivo para texto
        char valorChar = 'B';

        System.out.printf("Valor booleano: %b%nValor char: %c%n",valorBoolean, valorChar);

        float numFloat = 1.5F;
        int numInt1 = (int)numFloat;
        System.out.printf("Flotante: %1.2f, Entero: %d%n",numFloat, numInt1);

        char numChar = 'M';
        numChar++;
        int numInt2 = numChar;
        System.out.printf("Char: %c, Entero: %d%n",numChar, numInt2);
        }

}