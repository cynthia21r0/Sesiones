package mx.utng.s08;

public class Fabrica {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Ford",
                                        "Shelby", 
                                        1965, 
                                        25000);

        Automovil auto2 = new Automovil("Bugatti", 
                                        "Veyron Bleu Centenaire", 
                                        2009, 
                                        10000);

        Automovil auto3 = new Automovil("Ferrari", 
                                        "335 Spider Scaglietti", 
                                        1957, 
                                        12000);

        System.out.println("Auto 1, hash: "+ auto1.hashCode());
        System.out.println("Auto 2, hash: "+ auto2.hashCode());
        System.out.println("Auto 3, hash: "+ auto3.hashCode());

        Automovil auto4 = auto1;
        System.out.println("Auto 4, hash: "+ auto4.hashCode());
        
        auto1.setMarca("Chevrolet");
        System.out.println("Marca: "+auto4.getMarca());
    }
}
