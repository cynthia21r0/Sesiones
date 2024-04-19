/**
 * @autor:Cynthia Janeth Granados Estrada 
 * @category:GDS0624
 */
package mx.utng.s31;

import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Ejercicio2Tests {
    private final List<Integer> CONJUNTO = Arrays.asList(1, 4, 6, 2, -5, 9);

    @Test
    @DisplayName("Prueba para calcular los cuadrados de los numeros")
    void canGetSquare(){
        Ejercicio2 e2 = new Ejercicio2();

        List<Integer> real = e2.transformar(CONJUNTO, s -> s*s);

        assertThat(real).containsExactly(1, 16, 36, 4, 25, 81);
    }

    @Test
    void canTransformAndAdd(){
        Ejercicio2 e2 = new Ejercicio2();

        Integer real = e2.transformarYSumar(CONJUNTO, s -> 1);

        assertThat(real).isEqualTo(CONJUNTO.size());
    }
}
