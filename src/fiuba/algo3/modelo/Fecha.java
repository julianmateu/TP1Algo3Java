package fiuba.algo3.modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

	private static int MINUTO_0 = 0;
	private GregorianCalendar mCalendar;
	
	public Fecha(int anio, int mes, int dia, int hora) {
		mCalendar = new GregorianCalendar(anio, mes, dia, hora, MINUTO_0);
	}
	
	private Fecha(GregorianCalendar calendar) {
		mCalendar = calendar;
	}
	
	public Fecha sumarSemanas(int semanas) {
		GregorianCalendar calendar = (GregorianCalendar) mCalendar.clone();
		calendar.add(Calendar.DAY_OF_MONTH, 7*semanas);
		return new Fecha(calendar);
	}
		
	public boolean equals(Fecha fecha) {
		return this.mCalendar.equals(fecha.mCalendar);
	}
}
