package mx.utng.s10;

public class Bloques {
    private static int valor = 42;

    static {
    }

    public static void muestaValor() {
        System.out.println("El valor es: " + valor);
    }

    public static void main(String[] args) {
        Bloques bloques = new Bloques();
        Bloques.muestaValor();
 }
    
}
