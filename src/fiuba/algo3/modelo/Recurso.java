package fiuba.algo3.modelo;

import java.util.ArrayList;

/**
 * Clase que representa a un invitado que es recurso. No puede tener más de 
 * un evento en simultáneo.
 * 
 * @author 	Julian Mateu
 * @version	1.0
 * 
 */
public class Recurso extends Invitado {

	/**
	 * Constructor.
	 */
	public Recurso(String nombre) {
		mNombre = nombre;
		mListaDeEventos = new ArrayList<Evento>();
	}
	
	/**
	 * Agrega un evento a la agenda del recurso. Los recursos no pueden 
	 * tener más de un evento en la misma fecha en su agenda; si esto 
	 * ocurriera, se generaría una excepción.
	 */
	public void agregarEvento(Evento evento) {
		Fecha fecha = evento.getFecha();
		if (this.estaOcupado(fecha)) {
			throw new RecursoOcupadoException("Recurso " + mNombre 
					+ " ocupado en fecha: " + fecha);
		} else {
			mListaDeEventos.add(evento);
		}
	}
}
