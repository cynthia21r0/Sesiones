package mx.utng.sesion4;

public class Letras {
    public static void main(String[] args) {
        //Objetos necesarios
        Lector lector = new Lector();
        ContadorCaracteres contador = new ContadorCaracteres();
        //Uso el lector para imprimir texto y leer valores
        lector.muestraMensaje("Teclea una palabra: ");
        String palabra = lector.leerEntrada();

        //Usar el contador para sabes cuantos caracteres hay por cada apartado
        int vocales = contador.cuentaVocales(palabra);
        lector.muestraMensaje("El número de vocales es: " + vocales);

        int consonantes = contador.cuentaConsonantes(palabra);
        lector.muestraMensaje("El número de consonates es: " + consonantes);

        int numeros = contador.cuentaNumeros(palabra);
        lector.muestraMensaje("El número de números es: " + numeros);

        int simbolos = contador.cuentaSimbolos(palabra);
        lector.muestraMensaje("El número de símbolos es: " + simbolos);
    }
    
}
