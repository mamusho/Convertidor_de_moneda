package com.convertidor.logica;

public class Convertir {

	public Convertir() {
		
	}
	
	/*
	 * logica de la conversion de la moneda
	 */
	public double convierte(double deMoneda, double aMoneda, Double numeroCantidad ) {
		return (aMoneda/deMoneda)*numeroCantidad;
		
	}
	
	
	public String cambiarTemperatura(int temperatura, Double numeroCantidad) {
		
		double cantidad = numeroCantidad;
		double convertido = 0;
		
		switch (temperatura) {
		case 0: {

			convertido = (cantidad*1.8)+32;
			return convertido + "° F";
			
			
		} case 1: {
			
			convertido = (cantidad - 32)*5/9;
			return convertido + "° C";
			
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
		
	}
	
	
	
	
	
	
		
	
}
