//Cynthia Janeth Granados Estrada
//GDS0624
package mx.utng.s27;

import java.util.concurrent.TimeUnit;

public class Hilo1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hilo 1: "+i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
