package mx.utng.s12;

public class Polimorfismo {
    public static void main(String[] args) {
        //Crear un objeto v de la clase Venado
        Venado v = new Venado();

        Animal a = v;

        Hervivoro h = v;

        Object o = v;

        System.out.println("Venado: " + (v instanceof Venado));
        System.out.println("Animal: " + (a instanceof Animal));
        System.out.println("Hervivoro: " + (h instanceof Hervivoro));
        System.out.println("Object: " + (o instanceof Object));
        //System.out.println("Scanner: " + (v instanceof Scanner));

        v.comer();

        Humano humano = new Humano();
        humano.comer();
    }
    
}
