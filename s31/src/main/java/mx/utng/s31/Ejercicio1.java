/**
 * @autor:Cynthia Janeth Granados Estrada 
 * @category:GDS0624
 */
package mx.utng.s31;

import java.util.function.Function;

public class Ejercicio1 {

    //private final StringToInteger parser = s -> Integer.parseInt(s);

    //private final StringToInteger parser = Integer::parseInt;

    private final Function<String, Integer> parser = Integer::parseInt;

    Integer sumar(String a, String b){
        return parser.apply(a) + parser.apply(b);
    }
}
