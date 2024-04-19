import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String [] cadenas = new String[5];
        cadenas[0] = "Zanahoria";
        cadenas[1] = "Cilantro";
        cadenas[2] = "Lechuga";
        cadenas[3] = "Repollo";
        cadenas[4] = "Coliflor";

        System.out.println(Integer.MAX_VALUE);

        System.out.println(cadenas);
        System.out.println("---Foreach---");
        for (String c :  cadenas){
        System.out.println(c);
        }
        System.out.println("---Fori---");
        for (int i = 0; i < cadenas.length; i++){
            System.out.println(cadenas[i]);

        }
    
        List<String> verduras = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            verduras.add("Verdura: "+(i+1));
        }        
        for (String v : verduras){
            System.out.println(v);
        }
        verduras.set(0, "Zanahoria");
        verduras.set(1, "Cilantro");
        verduras.set(3, "Cebolla");
        verduras.set(4, "Ajo");
        verduras.remove(4);
        for (String v : verduras){
            System.out.println(v);
        }

    }
}
