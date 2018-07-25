package fjordan.com.peliculas.datos;

import fjordan.com.peliculas.domain.Pelicula;
import fjordan.com.peliculas.excepciones.*;
import java.util.List;

/**
 *
 * @author fjordan
 */
public interface AccesoDatos {
    
    /**
     * Realiza una búsqueda para saber si el archivo txt con el
     * nombre indicado ya ha sido creado
     * @param nombreArchivo 
     * @return True si encuentra el archivo en caso contrario retorna false
     * @throws AccesoDatosEx 
     */
    public boolean existe(String nombreArchivo) throws AccesoDatosEx;
    
    /**
     * Lista las películas que están actualmente en el archivo txt
     * @param nombreArchivo 
     * @return Lista de películas encontradas
     * @throws LecturaDatosEx 
     */
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;
    
    /**
     * Agregamos una película al archivo txt
     * @param pelicula
     * @param nombreArchivo
     * @param anexar tipo boolean, true para agregar al archivo, false sobrescribe el archivo
     * @throws EscrituraDatosEx 
     */
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

    /**
     * Busca dentro del archivo el nombre de la película enviada como 
     * argumento al parámetro buscar
     * @param nombreArchivo
     * @param buscar
     * @return Devuelve un String con la película encontrada
     * @throws LecturaDatosEx 
     */
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;
    
    /**
     * Crea un archivo dentro de la carpeta BDCatalogo del proyecto
     * con el nombre enviado como argumento al parametro nombreArchivo
     * @param nombreArchivo
     * @throws AccesoDatosEx 
     */
    public void crear(String nombreArchivo) throws AccesoDatosEx;
    
    /**
     * Borra el archivo con el nombre enviado como argumento al parametro nombreArchivo
     * @param nombreArchivo
     * @throws AccesoDatosEx 
     */
    public void borrar(String nombreArchivo) throws AccesoDatosEx;
}
