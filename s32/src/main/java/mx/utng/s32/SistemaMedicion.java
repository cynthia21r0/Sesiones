/**
 * @autor:Cynthia Janeth Granados Estrada 
 * @category:GDS0624
 */
package mx.utng.s32;

import java.util.concurrent.TimeUnit;

public class SistemaMedicion {
    
    double leer(int id){
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return id * Math.random();
    }
}
