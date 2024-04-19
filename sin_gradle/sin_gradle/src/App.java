import mx.utng.ej001.Autor;
import mx.utng.ej001.Libro;

public class App {
    public static void main(String[] args) throws Exception {
        Autor autor = new Autor();
        autor.setNombre("Panchito");
        autor.setApellido("Torres");
        autor.setEdad(18);

        Libro libro = new Libro();
        libro.setTitulo("Reglas para entender");
        libro.setAutor(autor);
        libro.setNumeroPaginas(30);

        System.out.println("Libro: "+libro.getTitulo());
        System.out.println("Autor: "+libro.getAutor().getNombre()
        +" "+libro.getAutor().getApellido());
    }
}
