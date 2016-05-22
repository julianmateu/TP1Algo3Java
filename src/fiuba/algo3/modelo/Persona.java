package fiuba.algo3.modelo;

import java.util.ArrayList;

public class Persona extends Invitado {
	
	public Persona(String nombre) {
		mNombre = nombre;
		mListaDeEventos = new ArrayList<Evento>();
	}

	public void agregarEvento(Evento evento) {
		mListaDeEventos.add(evento);
	}
	
}
