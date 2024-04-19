//Cynthia Janeth Granados Estrada
//GDS0624
package mx.utng.s08;
public class Area {
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo(4, 3);
        System.out.println("Area: "+ rec.area());

    }
    
}

class Rectangulo{
    private int base;
    private int altura;

    public Rectangulo(){
        this.base = 0;
        this.altura = 0;
    }

    public Rectangulo(int lado, int ancho){
        this.base = lado;
        this.altura = ancho;
    }

    public int area(){
        return base * altura;
    }

}