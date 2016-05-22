package fiuba.algo3.modelo;

public class InvitadoInexistenteExcepcion extends RuntimeException {

    public InvitadoInexistenteExcepcion(String message) {
        super(message);
    }

    public InvitadoInexistenteExcepcion(String message, Throwable throwable) {
        super(message, throwable);
    }
}
