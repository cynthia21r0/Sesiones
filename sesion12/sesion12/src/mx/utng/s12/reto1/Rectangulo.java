/**
 * @author: Cynthia Janeth Granados Estrada
 * @date: 6/02/2024
 * @group: GDS0624
 */
package mx.utng.s12.reto1;

public class Rectangulo implements Figura{
    private double base;
    private double altura;
    {
        base = 2;
        altura = 3;
    }
    @Override
    public void calcularArea() {
        System.out.printf("El rectangulo con base: %.1f y altura: %.1f tiene un area de: %.1f.%n"
        , base, altura, (base*altura));
    }
}