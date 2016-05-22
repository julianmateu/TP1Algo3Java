package fiuba.algo3.modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Clase básica para manejo de fechas. Se asume que todas las fechas son
 * horas, es decir, se puede especificar año, mes, día y hora, pero no
 * minutos o segundos.
 * 
 * @author 	Julian Mateu
 * @version 1.0	
 *
 */
public class Fecha {

	// Constante para indicar la hora en punto.
	private static int MINUTO_0 = 0;
	// El manejo interno de las fechas se hace con la clase 
	// GregorianCalendar.
	private GregorianCalendar mCalendar;
	
	/**
	 * Constructor.
	 */
	public Fecha(int anio, int mes, int dia, int hora) {
		mCalendar = new GregorianCalendar(anio, mes, dia, hora, MINUTO_0);
	}
	
	/**
	 * Constructor privado a partir de un calendar.
	 */
	private Fecha(GregorianCalendar calendar) {
		mCalendar = calendar;
	}
	
	/**
	 * Suma la cantidad indicada de semanas a la fecha.
	 * 
	 * @param semanas	Cantidad de semanas a sumar.
	 * @return			Otro objeto Fecha representando la suma.
	 */
	public Fecha sumarSemanas(int semanas) {
		GregorianCalendar calendar = (GregorianCalendar) mCalendar.clone();
		calendar.add(Calendar.WEEK_OF_MONTH, semanas);
		return new Fecha(calendar);
	}
	
	/**
	 * Método para saber si dos fechas son iguales, i.e., si representan
	 * la misma hora, día, mes y año.
	 */
	public boolean equals(Fecha fecha) {
		return this.mCalendar.equals(fecha.mCalendar);
	}
}
