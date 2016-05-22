package fiuba.algo3.modelo;

/**
 * Excepción que representa un invitado que no fue agregado previamente al
 * Calendario.
 * 
 * @author 	Julian Mateu
 * @version	1.0
 * 
 */
public class InvitadoInexistenteExcepcion extends RuntimeException {

	/**
	 * Constructor.
	 */
    public InvitadoInexistenteExcepcion(String message) {
        super(message);
    }
}
