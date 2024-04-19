import mx.utng.s07.Lector;
import mx.utng.s07.ListaTareas;
import mx.utng.s07.Menu;
public class App {
    public static void main(String[] args) throws Exception {
        //Crear objetos necesarios
        Menu menu = new Menu();
        Lector lector = new Lector();
        ListaTareas lista = new ListaTareas();

        byte opcionSeleccionada = 0;
        
        do {
            menu.muestraOpciones();
            opcionSeleccionada = lector.leerOpcion();
            System.out.printf("%n%nLa opcion seleccionada fue: %d%n", opcionSeleccionada);

            switch (opcionSeleccionada) {
                case 1:
                    lista.crearNuevaLista();
                    break;
                case 2:
                    lista.verListaTareas();;
                    break;
                case 3:
                    lista.verTareasDeLista();;
                    break;
                case 4:
                    lista.actualizarListaDeTareas();
                    break;
                case 5:
                    lista.eliminarListaTareas();
                    break;
                case 6:
                    System.out.println("Saliendo de la aplicacion... Adios");
                    break;
                default:
                    System.out.println("Opcion desconocida ");
                    break;
            }

        }while (opcionSeleccionada !=6);
    }
    
}
