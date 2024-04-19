/**
 * @autor:Cynthia Janeth Granados Estrada 
 * @category:GDS0624
 */
package mx.utng.s31;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Ejercicio2 {

    List<Integer> transformar(Iterable<Integer> conjunto, Function<Integer, Integer> funcion){
        List<Integer> nuevaLista = new ArrayList<>();
        for (Integer value : conjunto) {
            nuevaLista.add(funcion.apply(value));
        }
        return nuevaLista;
    }


    Integer transformarYSumar(Iterable<Integer> conjunto, Function<Integer, Integer> funcion){
        Integer acumulador = 0;

        for (Integer value : conjunto) {
            acumulador += funcion.apply(value);
        }
        return acumulador;
    }
}
