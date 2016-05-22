package fiuba.algo3.modelo;

import java.util.List;

/**
 * Calendario: permite administrar eventos, recursos y personas.
 * 
 * La clase funciona como una interfaz con el usuario, permitiéndole
 * efectuar tareas básicas como agregar personas y recursos, e invitarlos
 * a eventos.
 * 
 * @author 	Julian Mateu
 * @version 1.0	
 *
 */
public class Calendario {
	
	// El directorio contiene los invitados que se agregaron.
	private Directorio mDirectorioDeInvitados;
	
	/**
	 * Constructor.
	 */
	public Calendario() {
		mDirectorioDeInvitados = new Directorio();
	}
	
	/**
	 * Agrega una persona al Calendario.
	 */
	public void agregarPersona(String nombre) {
		mDirectorioDeInvitados.agregarPersona(nombre);
	}
	
	/**
	 * Agrega un recurso al Calendario.
	 */
	public void agregarRecurso(String nombre) {
		mDirectorioDeInvitados.agregarRecurso(nombre);
	}
	
	/**
	 * Permite saber una persona fue agregada previamente al Calendario.
	 */
	public boolean existePersona(String nombre) {
		return mDirectorioDeInvitados.existePersona(nombre);
	}
	
	/**
	 * Permite saber un recurso fue agregado previamente al Calendario.
	 */
	public boolean existeRecurso(String nombre) {
		return mDirectorioDeInvitados.existeRecurso(nombre);
	}
	
	/**
	 * Permite saber si un invitado está ocupado en una fecha dada.
	 */
	public boolean estaOcupado(String nombre, int anio, int mes,
			int dia, int hora) {
		Fecha fecha = new Fecha(anio, mes, dia, hora);
		return mDirectorioDeInvitados.estaOcupado(nombre, fecha);
	}

	/**
	 * Agrega un evento al Calendario, en la fecha especificada, con 
	 * los invitados especificados (asume que fueron previamente agregados
	 * al Calendario).
	 * 
	 * @param invitados	Lista de nombres de los invitados.
	 */
	public void agregarEvento(String nombre, List<String> invitados,
			int anio, int mes, int dia, int hora) {
		Fecha fecha = new Fecha(anio, mes, dia, hora);
		agregarEvento(nombre, invitados, fecha);
	}
	
	/**
	 * Agrega un evento al Calendario, en la fecha especificada, con 
	 * los invitados especificados (asume que fueron previamente agregados
	 * al Calendario).
	 * 
	 * @param invitados	Lista de nombres de los invitados.
	 * @param fecha		Objeto Fecha con la fecha del evento a agregar.
	 */
	public void agregarEvento(String nombre, List<String> invitados,
			Fecha fecha) {
		Evento evento = new Evento(nombre, fecha);
		mDirectorioDeInvitados.agregarEvento(evento, invitados);
	}

	/**
	 * Agrega un evento semanal al Calendario, en la fecha especificada
	 * y cada 1 semana, durante la cantidad de semanas expecificada, con 
	 * los invitados especificados (asume que fueron previamente agregados
	 * al Calendario).
	 * 
	 * @param invitados	Lista de nombres de los invitados.
	 * @param semanas	Duración en semanas del evento semanal.
	 */
	public void agregarEventoSemanal(String nombre, int semanas,
			List<String> invitados, int anio, int mes, int dia, int hora) {
		Fecha fecha = new Fecha(anio, mes, dia, hora);
		for (int i = 0; i < semanas; i++) {
			Evento evento = new Evento(nombre, fecha.sumarSemanas(i));
			mDirectorioDeInvitados.agregarEvento(evento, invitados);
		}
		
	}
}
