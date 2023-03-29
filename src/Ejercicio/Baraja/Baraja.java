package Ejercicio.Baraja;


import Ejercicio.Carta.Carta;
import TiposEnum.TipoNumero;
import TiposEnum.TipoPalo;

public class Baraja {

	private Carta[] baraja;
	private Carta[]barajaUsuario;
	private final int tamanyoTotal=40;
	private int totalCartas;

	public Baraja() {
		this.baraja=new Carta[tamanyoTotal];
		rellenarBaraja();
	}

	public Carta[] getBaraja() {
		return baraja;
	}

	public void setBaraja(Carta[] baraja) {
		this.baraja = baraja;
	}


	public void barajar() {
		for(int i=0;i<baraja.length;i++) {
			int num =numRamdom();
			Carta temp=baraja[i];
			baraja[i]=baraja[num];
			baraja[num]=temp;
			
		}
	}
	public void darCartas(int numeroCartas) {
		this.totalCartas=numeroCartas;
		this.barajaUsuario=new Carta[numeroCartas];
		for(int i=0;i<barajaUsuario.length;i++) {
		do {
			
			barajaUsuario[i]=baraja[numRamdom()];
		}
			
			while(!checkCartas()) ;
			
			
		}
		System.out.println("******** Mostrando Cartas usuario *********");
		System.out.println(mostrarBusuario());
	}
	
	public int cartasDisponibles() {
		return tamanyoTotal -totalCartas;
	}
	private boolean checkCartas() {
		boolean isOk=true;
		for(int i=0;i<barajaUsuario.length;i++) {
		
			if(barajaUsuario[i]!=null) {
				Carta obj=barajaUsuario[i];
				for(int z=0;z<barajaUsuario.length;z++ ) {
					if(obj.equals(barajaUsuario[z]) && i!=z) {
						isOk=false;
					}
					
				}
			}
		}
		return isOk;
	}
	private int numRamdom() {
		int num=(int)(Math.random()*39);
		return num;
	}
	private void rellenarBaraja() {
		int contador=0;
		int contadorPalo=0;
		Carta obj1=new Carta();
		obj1.setPalo(TipoPalo.espadas);
	
		for(int i=0;i<4;i++) {
	
			for(TipoNumero obj: TipoNumero.values()) {
				baraja[contador]=new Carta();
				baraja[contador].setNumero(obj);
				baraja[contador].setPalo(obj1.getPalo());
				contador++;
	
			}
			contadorPalo++;
			switch (contadorPalo) {
	
			case 1:{
				obj1.setPalo(TipoPalo.bastos);
	
				break;
			}
			case 2:{
				obj1.setPalo(TipoPalo.oros);
	
				break;
			}
			case 3:{
				obj1.setPalo(TipoPalo.copas);
	
				break;
			}
	
	
			}
		}
	}

	public String toString() {
		String out="";
		for(Carta obj:baraja) {
			if(obj!=null) {
				out+=obj.toString()+"\n";
			}
		}
		return out;
	}
	public String mostrarBusuario() {
		String out="";
		for(Carta obj:barajaUsuario) {
			if(obj!=null) {
				out+=obj.toString()+"\n";
			}
		}
		return out;
	}

	

	
	
}

	
