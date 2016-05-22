package fiuba.algo3.modelo;

import java.util.ArrayList;

/**
 * Clase que representa a un invitado que es persona. Puede tener más de 
 * un evento en simultáneo.
 * 
 * @author 	Julian Mateu
 * @version	1.0
 * 
 */
public class Persona extends Invitado {
	
	/**
	 * Constructor.
	 */
	public Persona(String nombre) {
		mNombre = nombre;
		mListaDeEventos = new ArrayList<Evento>();
	}

	/**
	 * Agrega un evento a la agenda de la persona. Las personas pueden 
	 * tener más de un evento en la misma fecha en su agenda.
	 */
	public void agregarEvento(Evento evento) {
		mListaDeEventos.add(evento);
	}
	
}
