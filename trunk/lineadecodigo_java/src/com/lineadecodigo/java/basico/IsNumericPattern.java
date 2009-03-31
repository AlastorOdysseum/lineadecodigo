package com.lineadecodigo.java.basico;

/**
 * @file isNumericPattern.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   31/marzo/2009
 * @url  http://lineadecodigo.com/2009/03/31/validar-si-un-dato-es-numerico-con-patrones-en-java/
 * @description Valida si una cadena introducida por pantalla es un n�mero mediante patrones
 */

public class IsNumericPattern {

	public static void main(String[] args) {
		
		String cadenaUno = "1234";
		String cadenaDos = "No soy un numero";
	
		
		if (cadenaUno.matches("[0-9]*"))
			System.out.println("Es un n�mero");
		else
			System.out.println("No es un n�mero");
		
		
		if (cadenaDos.matches("[0-9]*"))
			System.out.println("Es un n�mero");
		else
			System.out.println("No es un n�mero");
		
		
	}

}
