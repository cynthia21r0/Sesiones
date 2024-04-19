package mx.utng.s11;

public class PruebaTriangulo {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5.0, 4.0, "Color pastel");
        System.out.println("info. del Triangulo 1");
        triangulo.mostrarDimension();
        triangulo.mostrarEstilo();
        System.out.println("Su área es: "+triangulo.area());

        Triangulo triangulo2 = new Triangulo(8.0, 2.0, "Color morado");
        System.out.println("info. del Triangulo 2");
        triangulo2.mostrarDimension();
        triangulo2.mostrarEstilo();
        System.out.println("Su área es: "+triangulo2.area());

        Triangulo triangulo3 = new Triangulo(3.0, 4.0, "Color rojo");
        System.out.println("info. del Triangulo 3");
        triangulo3.mostrarDimension();
        triangulo3.mostrarEstilo();
        System.out.println("Su área es: "+triangulo3.area());
    }
    
}
