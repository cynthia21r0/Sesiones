/**
 * @author: Cynthia Janeth Granados Estrada
 * @date: 6/02/2024
 * @group: GDS0624
 */
package mx.utng.s12.reto1;

public class PruebaFigura {
    public static void main(String[] args) {
        Figura figura;

        figura = new Triangulo();
        figura.calcularArea();

        figura = new Cuadrado();
        figura.calcularArea();

        figura = new Rectangulo();
        figura.calcularArea();
    }
}