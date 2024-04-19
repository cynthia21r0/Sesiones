/**
 * @autor:Cynthia Janeth Granados Estrada 
 * @category:GDS0624
 */
package mx.utng.s32;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ejercicio1 {
    static void obtenerPromedio(Stream<Integer> ids){
        LocalTime inicio = LocalTime.now(); //con esta variable obtenemos el tiempo de inicio

        double promedio = ids.mapToDouble(id -> new SistemaMedicion().leer(id)) //pasamos el stream de numeros
        .average() //Retorna el promedio
        .orElse(0); //Retorna 0 si no se puedieron obtener los valores

        Duration tiempo = Duration.between(inicio, LocalTime.now()); //Calculamos la duracion entre el inicio y el momento actual

        System.out.println((Math.round(promedio * 100.)/100.)+" en "+
        tiempo.toMillis()+"ms"); //Imprimimos resultado
    }

    public static void main(String[] args) {
        List<Integer> ids = IntStream.range(1, 11).boxed().collect(Collectors.toList());

        obtenerPromedio(ids.stream());
        obtenerPromedio(ids.parallelStream());
    }
}
