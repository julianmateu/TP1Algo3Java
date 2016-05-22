package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Directorio: permite administrar invitados.
 * 
 * La clase provee una funcionalidad básica para agregar personas o
 * recursos, saber si existen, si están ocupados, o agregar eventos.
 * 
 * @author 	Julian Mateu
 * @version 1.0	
 *
 */
public class Directorio {
	
	// La lista de invitados.
	private ArrayList<Invitado> mListaDeInvitados;
	
	/**
	 * Constructor.
	 */
	public Directorio() {
		mListaDeInvitados = new ArrayList<Invitado>();
	}
	
	/**
	 * Agrega una persona al Directorio.
	 */
	public void agregarPersona(String nombre) {
		Persona persona = new Persona(nombre);
		mListaDeInvitados.add(persona);
	}
	
	/**
	 * Agrega un recurso al Directorio.
	 */
	public void agregarRecurso(String nombre) {
		Recurso recurso = new Recurso(nombre);
		mListaDeInvitados.add(recurso);
	}
	
	/**
	 * Permite saber una persona fue agregada previamente al Directorio.
	 */
	public boolean existePersona(String nombre) {
		return existeInvitado(nombre, Persona.class);
	}
	
	/**
	 * Permite saber un recurso fue agregado previamente al Directorio.
	 */
	public boolean existeRecurso(String nombre) {
		return existeInvitado(nombre, Recurso.class);
	}
	
	/**
	 * Permite saber un invitado fue agregado previamente al Directorio.
	 */
	public boolean existeInvitado(String nombre) {
		return existeInvitado(nombre, Invitado.class);
	}
	
	/**
	 * Permite saber un invitado de una subclase específica fue agregado
	 * previamente al Directorio.
	 * 
	 * @param	claseDelInvitado La subclase por la que se desea consultar.
	 */
	public boolean existeInvitado(String nombre, Class claseDelInvitado) {
		for (Invitado invitado : mListaDeInvitados) {
			if (invitado.getNombre() == nombre
					&& claseDelInvitado.isInstance(invitado)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Permite saber si un invitado está ocupado en una fecha dada.
	 */
	public boolean estaOcupado(String nombre, Fecha fecha) {
		if(!this.existeInvitado(nombre)) {
			throw new InvitadoInexistenteExcepcion(
					"No existe el invitado: " + nombre);
		}
		for (Invitado invitado : mListaDeInvitados) {
			if (invitado.getNombre() == nombre) {
				return invitado.estaOcupado(fecha);
			}
		}
		return false;
	}
	
	/**
	 * Agrega un evento al Calendario, en la fecha especificada, con 
	 * los invitados especificados (asume que fueron previamente agregados
	 * al Calendario).
	 * 
	 * @param invitados	Lista de nombres de los invitados.
	 * @param evento	Objeto Evento a agregar a los invitados.
	 */
	public void agregarEvento(Evento evento, List<String> invitados){
		for (String nombre : invitados) {
			if(!this.existeInvitado(nombre)) {
				throw new InvitadoInexistenteExcepcion(
						"No existe el invitado: " + nombre);
			}
			for (Invitado invitado : mListaDeInvitados) {
				if (invitado.getNombre() == nombre) {
					invitado.agregarEvento(evento);
				}
			}
		}
	}
}
