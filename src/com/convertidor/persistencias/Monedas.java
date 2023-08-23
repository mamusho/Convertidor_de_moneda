package com.convertidor.persistencias;


public class Monedas {
	
	/**
	 * Datos del valor de la moneda establecidos manualmente en base a 1 dolar con sus getter para el ejercicio ya que no necesitamos settear ningun valor por el momento.
	 */
	
	private double dolar = 1;
	private double mxn = 17.05;
	private double euro = 0.91;
	private double librasEsterlinas = 0.78;
	private double yen = 141.75;
	private double won = 1304.08;
	
	public Monedas() {
		
	}

	public double getDolar() {
		return dolar;
	}
	
	public double getMxn() {
		return mxn;
	}
	
	public double getEuro() {
		return euro;
	}
	
	public double getLibrasEsterlinas() {
		return librasEsterlinas;
	}
	
	public double getYen() {
		return yen;
	}
	
	public double getWon() {
		return won;
	}

	
	
	
	
	
	
}
