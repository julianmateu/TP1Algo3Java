package fiuba.algo3.tests;

import java.util.ArrayList;

import org.junit.Test;

import fiuba.algo3.modelo.Directorio;
import fiuba.algo3.modelo.Evento;
import fiuba.algo3.modelo.Fecha;
import fiuba.algo3.modelo.InvitadoInexistenteException;

public class DirectorioTests {

	@Test(expected=InvitadoInexistenteException.class)
	public void testAgregarEventoAInvitadoInexistenteLanzaExcepcion() {
		Directorio directorio = new Directorio();
		Fecha fecha = new Fecha(2016,5,22,10);
		Evento evento = new Evento("Evento de prueba",fecha);
		ArrayList<String> invitados = new ArrayList<String>();
		
		invitados.add("InvitadoInexistente");
		
		directorio.agregarEvento(evento,invitados);
	}

}
