package fiuba.algo3.modelo;

import java.util.ArrayList;

public abstract class Invitado {
	
	protected String mNombre;
	protected ArrayList<Evento> mListaDeEventos;
	
	public String getNombre() {
		return mNombre;
	}

	public abstract void agregarEvento(Evento evento);
	
	public boolean estaOcupado(Fecha fecha) {
		for (Evento evento : mListaDeEventos) {
			if (fecha.equals(evento.getFecha())) {
				return true;
			}
		}
		return false;
	}
}
