package fiuba.algo3.modelo;

/**
 * Excepción que representa un recurso que está ocupado en la fecha en la 
 * que se intenta agregar un nuevo evento.
 * 
 * @author 	Julian Mateu
 * @version	1.0
 * 
 */
public class RecursoOcupadoException extends RuntimeException {

	/**
	 * Constructor.
	 */
    public RecursoOcupadoException(String message) {
        super(message);
    }
}
