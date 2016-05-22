package fiuba.algo3.modelo;

import java.util.List;

public class Calendario {
	
	private Directorio mDirectorioDeInvitados;
	
	public Calendario() {
		mDirectorioDeInvitados = new Directorio();
	}
	
	public boolean existePersona(String nombre) {
		return mDirectorioDeInvitados.existePersona(nombre);
	}
	
	public boolean existeRecurso(String nombre) {
		return mDirectorioDeInvitados.existeRecurso(nombre);
	}
	
	public void agregarPersona(String nombre) {
		mDirectorioDeInvitados.agregarPersona(nombre);
	}
	
	public void agregarRecurso(String nombre) {
		mDirectorioDeInvitados.agregarRecurso(nombre);
	}
	
	public boolean estaOcupado(String nombre, int anio, int mes,
			int dia, int hora) {
		Fecha fecha = new Fecha(anio, mes, dia, hora);
		return mDirectorioDeInvitados.estaOcupado(nombre, fecha);
	}

	public void agregarEvento(String nombre, List<String> invitados,
			int anio, int mes, int dia, int hora) {
		Fecha fecha = new Fecha(anio, mes, dia, hora);
		agregarEvento(nombre, invitados, fecha);
	}
	
	public void agregarEvento(String nombre, List<String> invitados,
			Fecha fecha) {
		Evento evento = new Evento(nombre, fecha);
		mDirectorioDeInvitados.agregarEvento(evento, invitados);
	}

	public void agregarEventoSemanal(String nombre, int semanas,
			List<String> invitados, int anio, int mes, int dia, int hora) {
		Fecha fecha = new Fecha(anio, mes, dia, hora);
		for (int i = 0; i < semanas; i++) {
			Evento evento = new Evento(nombre, fecha.sumarSemanas(i));
			mDirectorioDeInvitados.agregarEvento(evento, invitados);
		}
		
	}
}
