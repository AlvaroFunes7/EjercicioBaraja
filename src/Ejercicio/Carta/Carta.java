package Ejercicio.Carta;

import java.util.Objects;

import TiposEnum.TipoNumero;
import TiposEnum.TipoPalo;
import arboleda.utils.Consola;

public class Carta {
	private TipoNumero numero;
	private TipoPalo palo;

	public Carta() {
		this.numero=TipoNumero.uno;
		this.palo=TipoPalo.oros;
	}

	public Carta(TipoNumero num, TipoPalo palo) {
		this.numero=num;
		this.palo=palo;
	}

	public TipoNumero getNumero() {
		return this.numero;
	}
	
	public TipoPalo getPalo() {
		return this.palo;
	}
	
	public void setNumero(TipoNumero num) {
		this.numero=num;
	}
	
	public void setNumero() {
		for(TipoNumero obj:TipoNumero.values()) {
			System.out.println(obj.getNumero()+" - "+obj.name());
		}
		int opcion;
		do {
		 opcion=Consola.pedirDatosInt("Elige un número:");
		switch (opcion) {
		case  1:{
			this.numero=TipoNumero.uno;
			break;
		}
		case  2:{
			this.numero=TipoNumero.dos;
			break;
		}
		case  3:{
			this.numero=TipoNumero.tres;
			break;
		}
		case  4:{
			this.numero=TipoNumero.cuatro;
			break;
		}
		case  5:{
			this.numero=TipoNumero.cinco;
			break;
		}
		case  7:{
			this.numero=TipoNumero.siete;
			break;
		}
		case  10:{
			this.numero=TipoNumero.diez;
			break;
		}
		case  11:{
			this.numero=TipoNumero.once;
			break;
		}
		case  12:{
			this.numero=TipoNumero.doce;
			break;
		}
			

		default:{
			System.out.println("Elección no encontrada..");
			break;
		}
		}
		}while(opcion>12 || opcion==8 || opcion==9 || opcion<1); 
		}
	
	public void setPalo(TipoPalo palo) {
		this.palo=palo;
	}
	public void setPalo() {
		int opcion;
		for(TipoPalo obj:TipoPalo.values()) {
			System.out.println(obj.ordinal()+1 +" - "+ obj);
		}
		
		do {
			opcion=Consola.pedirDatosInt("Elige un palo:");
			
			switch (opcion) {
			case 1:{
				this.palo=TipoPalo.espadas;
				break;
			}
			case 2:{
				this.palo=TipoPalo.bastos;
				break;
			}
			case 3:{
				this.palo=TipoPalo.oros;
				break;
			}
			case 4:{
				this.palo=TipoPalo.copas;
				break;
			}

			default:{
				System.out.println("Palo no encontrado..");
				break;
			}
			}
		}
		while(opcion>4 || opcion<1);
	}
	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", palo=" + palo + "]";
	}

	

	
	public boolean equals(Object obj) {
		boolean isSame=false;
		if(obj!=null && obj instanceof Carta) {
			isSame=this.numero.equals(((Carta)obj).getNumero()) && this.palo.equals(((Carta)obj).getPalo());
		}
		return isSame;
	}

	
}
