package fiuba.algo3.modelo;

import java.util.ArrayList;

public class Recurso extends Invitado {

	public Recurso(String nombre) {
		mNombre = nombre;
		mListaDeEventos = new ArrayList<Evento>();
	}
	
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
