/**
 * @author: Cynthia Janeth Granados Estrada
 * @date: 6/02/2024
 * @group: GDS0624
 */
package mx.utng.s12.reto1;

public class Triangulo implements Figura {
    private double base;
    private double altura;
    {
        base = 2;
        altura = 7;
    }
    @Override
    public void calcularArea() {
        System.out.printf("El área del triangulo con base: %.1f y con altura: %.1f es: %.1f.%n"
        , base, altura, (base*altura/2));
    }
}