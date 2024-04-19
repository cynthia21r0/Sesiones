
package mx.utng.s17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binario {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        //Declaramos instacion de BufferedInputStream
        BufferedInputStream bis = new BufferedInputStream
        (new FileInputStream("C:\\Users\\cynth\\Desktop\\Cynthia\\sesion17\\sesion17\\src\\mx\\utng\\s17\\gato.png"));
        //Declaramos instancia de BufferedOutputStream
        BufferedOutputStream bos = new BufferedOutputStream
        (new FileOutputStream("C:\\\\Users\\\\cynth\\\\Desktop\\\\Cynthia\\\\sesion17\\\\sesion17\\\\src\\\\mx\\\\utng\\\\s17\\\\gato_copia.png"));

        //Definimos el buffer de escritura de datos
        byte[] buffer = new byte[1024];
        //inicar la copia del archivo
        int bytesLeidos = 0;
        while ((bytesLeidos = bis.read(buffer))>0) {
            bos.write(buffer, 0,bytesLeidos);
        }

        bos.close();
        bis.close();
    }
}
