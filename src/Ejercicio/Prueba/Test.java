package Ejercicio.Prueba;

import Ejercicio.Baraja.Baraja;
import Ejercicio.Carta.Carta;
import arboleda.utils.Consola;

public class Test {
	public static void testCartas() {
		Carta obj=new Carta();
		 System.out.println(obj.toString());
		 obj.setNumero();
		 obj.setPalo();
		 System.out.println(obj.toString());
	}
	
	public static void testBaraja() {
		Baraja obj=new Baraja();
		System.out.println(obj.toString());
		
		obj.barajar();
		System.out.println("*************************************************");
		System.out.println(obj.toString());
	}
	
	public static void testDarCartas() {
		Baraja obj=new Baraja();	
		obj.barajar();
		
		obj.darCartas(Consola.pedirDatosInt("¿Cuantas cartas quieres?:"));
		
		System.out.println("Quedan un total de "+obj.cartasDisponibles()+ " cartas disponibles para repartir." );
		
	}
		
	
}
