/**
 * @author: Cynthia Janeth Granados Estrada
 * @date: 6/02/2024
 * @group: GDS0624
 */
package mx.utng.s12.reto1;

public class Cuadrado implements Figura{
    private double lado;
    {
        lado = 5;
    }

    @Override
    public void calcularArea() {
        System.out.printf("El cuadrado con base de: %.1f tiene un area de: %.1f.%n"
        , lado, (lado*lado));
    }
    
}