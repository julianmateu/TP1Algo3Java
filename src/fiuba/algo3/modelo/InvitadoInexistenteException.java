package fiuba.algo3.modelo;

/**
 * Excepción que representa un invitado que no fue agregado previamente al
 * Calendario.
 * 
 * @author 	Julian Mateu
 * @version	1.0
 * 
 */
public class InvitadoInexistenteException extends RuntimeException {

	/**
	 * Constructor.
	 */
    public InvitadoInexistenteException(String message) {
        super(message);
    }
}
