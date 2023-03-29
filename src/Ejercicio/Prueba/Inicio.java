package Ejercicio.Prueba;

import Ejercicio.Baraja.Baraja;

public class Inicio {
	public static void main(String[] args) {
		try {
			
			Test.testDarCartas();
			
		} catch (Exception e) {
			System.out.println("Estamos en labores de mantenimiento...");
		}
	}
}
