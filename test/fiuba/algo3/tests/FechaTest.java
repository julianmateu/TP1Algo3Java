package fiuba.algo3.tests;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.modelo.Fecha;

public class FechaTest {

	@Test
	public void test01CrearFechasYCorroborarQueSonLasEsperadas() {
		Fecha fecha = new Fecha(2016,5,22,10);
		Assert.assertEquals("2016/May/22 : 10",fecha.toString());
		
		fecha = new Fecha(2016,2,29,15);
		Assert.assertEquals("2016/Feb/29 : 15", fecha.toString());
	}
	
	@Test
	public void test02IgualdadDeFechas() {
		Fecha fecha1 = new Fecha(2016,5,22,10);
		Fecha fecha2 = new Fecha(2016,5,22,10);
		Fecha fecha3 = new Fecha(2016,5,22,11);
		
		Assert.assertTrue(fecha1.equals(fecha1));
		Assert.assertTrue(fecha1.equals(fecha2));
		Assert.assertFalse(fecha1.equals(fecha3));
	}
	
	@Test
	public void test03SumarSemanasCambiandoDeMes() {
		Fecha fecha1 = new Fecha(2016,5,22,10);
		Fecha fecha2 = new Fecha(2016,5,29,10);
		Fecha fecha3 = new Fecha(2016,6,5,10);
		
		Assert.assertTrue(fecha2.equals(fecha1.sumarSemanas(1)));
		Assert.assertTrue(fecha3.equals(fecha1.sumarSemanas(2)));
	}
	
	@Test
	public void test03SumarSemanasCambiandoDeAnio() {
		Fecha fecha1 = new Fecha(2015,12,28,23);
		Fecha fecha2 = new Fecha(2016,1,4,23);
		Fecha fecha3 = new Fecha(2016,2,29,23);
		
		Assert.assertTrue(fecha2.equals(fecha1.sumarSemanas(1)));
		Assert.assertTrue(fecha3.equals(fecha1.sumarSemanas(9)));
	}
}
