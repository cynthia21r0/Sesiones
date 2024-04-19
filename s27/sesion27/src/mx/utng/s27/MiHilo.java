//Cynthia Janeth Granados Estrada
//GDS0624
package mx.utng.s27;

import java.util.concurrent.TimeUnit;

public class MiHilo extends Thread{
    String parametro;

    public MiHilo(String parametro){ //Constructor de la clase MiHilo
        this.parametro = parametro;
    }

    @Override //al momento de heredar un hilo, se comporte con distintos procesos al mismo tiempo (distintos hilos, para eso funciona el metodo run)
    public void run(){
        while (!"terminar".equals(parametro)) {
            mostrarInformacion();
            pausarUnSegundo();
        }
    }

    private static void pausarUnSegundo() {
        try {
            TimeUnit.SECONDS.sleep(1); //se esta diciendo que pause un segundo
        } catch (InterruptedException e) { //este apartado es en caso para que falle
            e.printStackTrace();
        }
    }

    private void mostrarInformacion() {
        String tipoHilo = isDaemon() ? "daemon" : "usuario";

        System.out.println(tipoHilo + "\t | Nombre: "+getName()+ "\t | ID: "+getId()+"\t | Parametro: "+parametro);//La diagonal invertida (\) significa que despliega un tabulador
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    public static void main(String[] args) {
        MiHilo hilo1 = new MiHilo("Uno");
        hilo1.start();
        
        MiHilo hilo2 = new MiHilo("Dos");
        hilo2.setDaemon(true);
        hilo2.start();

        MiHilo.pausarUnSegundo();

        hilo1.setParametro("Terminar");

        System.out.println("**Fin del hilo main**");
    }
    
}
