package fiuba.algo3.modelo;

public class Evento {
	
	private String mNombre;
	private Fecha mFecha;
	
	public Evento(String nombre, Fecha fecha) {
		mNombre = nombre;
		mFecha = fecha;
	}
	
	public Fecha getFecha() {
		return mFecha;
	}
}
