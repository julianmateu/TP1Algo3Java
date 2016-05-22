package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Directorio {
	
	private ArrayList<Invitado> mListaDeInvitados;
	
	public Directorio() {
		mListaDeInvitados = new ArrayList<Invitado>();
	}
	
	public void agregarPersona(String nombre) {
		Persona persona = new Persona(nombre);
		mListaDeInvitados.add(persona);
	}
	
	public void agregarRecurso(String nombre) {
		Recurso recurso = new Recurso(nombre);
		mListaDeInvitados.add(recurso);
	}
	
	public boolean existePersona(String nombre) {
		return existeInvitado(nombre, Persona.class);
	}
	
	public boolean existeRecurso(String nombre) {
		return existeInvitado(nombre, Recurso.class);
	}
	
	public boolean existeInvitado(String nombre) {
		return existeInvitado(nombre, Invitado.class);
	}
	
	public boolean existeInvitado(String nombre, Class claseDelInvitado) {
		for (Invitado invitado : mListaDeInvitados) {
			if (invitado.getNombre() == nombre
					&& claseDelInvitado.isInstance(invitado)) {
				return true;
			}
		}
		return false;
	}
	
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
}
