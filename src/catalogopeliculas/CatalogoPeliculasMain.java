package catalogopeliculas;

import fjordan.com.peliculas.negocio.*;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author fjordan
 */
public class CatalogoPeliculasMain {

    /**
     * @param args the command line arguments
     */
    private static int opcion = -1;
    private static final CatalogoPeliculas catalogoPeli = new CatalogoPeliculasImpl();

    public static void main(String[] args) {

        Properties propiedades = System.getProperties();
        String nombreArchivo = propiedades.getProperty("user.dir") + "/src/BDCatalogo/peliculas.txt";

        Scanner scanner = new Scanner(System.in);
        

        while (opcion != 0) {
            try {
                System.out.println("Elige opcion:\n1.- Iniciar catalogo peliculas"
                        + "\n2.- Agregar pelicula\n"
                        + "3.- Listar Peliculas\n"
                        + "4.- Buscar Pelicula\n"
                        + "0.- Salir");
                
                opcion = Integer.parseInt(scanner.nextLine());
                
                switch(opcion){
                    
                    case 1:
                        catalogoPeli.iniciarArchivo(nombreArchivo);
                        break;
                    case 2:
                        System.out.println("Intruduce el nombre de la pelicula a agregar");
                        String nombre = scanner.nextLine();
                        catalogoPeli.agregarPelicula(nombre, nombreArchivo);
                        break;
                    case 3:
                        catalogoPeli.listarPeliculas(nombreArchivo);
                        break;
                    case 4:
                        System.out.println("Intruduce el nombre de la pelicula que desea buscar");
                        String nombreBuscar = scanner.nextLine();
                        catalogoPeli.buscarPelicula(nombreArchivo, nombreBuscar);
                        break;
                    case 0:
                        System.out.println("Hasta Pronto");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n");
                
            } catch (Exception e) {
                System.out.println("Error!");
            }
        }

    }

}
