package fiuba.algo3.modelo;

/**
 * Clase básica para utilizar eventos. Los mismos poseen un nombre y una 
 * fecha. Se asume que duran 1 hora.
 * 
 * @author 	Julian Mateu
 * @version 1.0	
 *
 */
public class Evento {
	
	private String mNombre;
	private Fecha mFecha;
	
	/**
	 * Constructor.
	 */
	public Evento(String nombre, Fecha fecha) {
		mNombre = nombre;
		mFecha = fecha;
	}
	
	/**
	 * Getter para la fecha.
	 */
	public Fecha getFecha() {
		return mFecha;
	}
	
	/**
	 * Getter para el nombre.
	 */
	public String getNombre() {
		return mNombre;
	}
}
