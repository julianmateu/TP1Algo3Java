package fiuba.algo3.modelo;

import java.util.Date;
import java.util.GregorianCalendar;
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
		Evento evento = new Evento(nombre, fecha);
		mDirectorioDeInvitados.agregarEvento(evento, invitados);
	}
}
