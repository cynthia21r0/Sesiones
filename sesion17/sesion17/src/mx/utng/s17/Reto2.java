/**  
*@author:Cynthia Janeth Granados Estrada
*@date: 16/02/2024
*@group: GDS0624 
*/
package mx.utng.s17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Reto2 {
    public static void main(String[] args) throws IOException{
        
        //Crear una instancia de archivos
        File archivo = new File("src\\mx\\utng\\s17\\poema.txt");

        //Nombre del archivo
        System.out.println("Nombre del archivo: "+archivo.getName());

        //Crear un escritor de archivos
        FileWriter fw = new FileWriter("C:\\Users\\cynth\\Desktop\\Cynthia\\sesion17\\sesion17\\src\\mx\\utng\\s17\\poema.txt");

        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write("Cynthia Janeth Granados Estrada\n");
        bw.newLine();
        bw.newLine();
        
        bw.write("POEMA ROMANTICO.\n\n");

        bw.write("En el silencio complice, un susurro escondido, \n");
        bw.write("dos corazones laten, su amor no admitido. \n");
        bw.write("Entre miradas furtivas, se buscan en secreto, \n");
        bw.write("un sentimiento callado, profundo y discreto. \n");
        
        bw.newLine();

        bw.write("Bajo el cielo estrellado, se encuentran en susurros, \n");
        bw.write("dos almas entrelazadas, guardando sus juramentos. \n");
        bw.write("En el rincon de lo oculto, florece su desvelo, \n");
        bw.write("un amor que late, en el misterio del anhelo. \n");
        
    
        //Crear un objeto que permita la lectura de archivo
        FileReader fr = new FileReader(
        "C:\\Users\\cynth\\Desktop\\Cynthia\\sesion17\\sesion17\\src\\mx\\utng\\s17\\poema.txt");
        BufferedReader br = new BufferedReader(fr);
        String linea = null;
        while ((linea = br.readLine())!=null) {
            System.out.println(linea);
        }
        bw.close();
        br.close();
    }
}
