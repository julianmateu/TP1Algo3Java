package fiuba.algo3.modelo;

import java.util.ArrayList;

/**
 * Clase abstracta para representar Invitados que contienen una agenda de
 * eventos. 
 * 
 * @author 	Julian Mateu
 * @version 1.0	
 *
 */
public abstract class Invitado {
	
	protected String mNombre;
	protected ArrayList<Evento> mListaDeEventos;
	
	/**
	 * Constructor.
	 */
	public String getNombre() {
		return mNombre;
	}

	/**
	 * Agrega un evento a la agenda del invitado.
	 */
	public abstract void agregarEvento(Evento evento);
	
	/**
	 * Permite saber si el invitado está ocupado en una fecha dada.
	 */
	public boolean estaOcupado(Fecha fecha) {
		for (Evento evento : mListaDeEventos) {
			if (fecha.equals(evento.getFecha())) {
				return true;
			}
		}
		return false;
	}
}
