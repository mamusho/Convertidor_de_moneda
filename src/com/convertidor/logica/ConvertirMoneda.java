package com.convertidor.logica;

import java.text.DecimalFormat;

public class ConvertirMoneda {

	public ConvertirMoneda() {
		
	}
	
	/*
	 * logica de la conversion de la moneda
	 */
	public double convierte(double deMoneda, double aMoneda, Double numeroCantidad ) {
		return (aMoneda/deMoneda)*numeroCantidad;
		
		
	}
	
	
	
	
	
	
		
	
}
