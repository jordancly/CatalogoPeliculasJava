package fjordan.com.peliculas.excepciones;

/**
 *
 * @author fjordan
 */
public class AccesoDatosEx extends Exception{
    
    String mensaje;
    
    public AccesoDatosEx(String mensaje){
       super(mensaje);
    }
}
