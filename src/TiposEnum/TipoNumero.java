package TiposEnum;

public enum TipoNumero {
	uno(1),dos(2),tres(3),cuatro(4),cinco(5),seis(6),siete(7),diez(10),once(11),doce(12);
	
	private int numero;

	private TipoNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	
	
}
