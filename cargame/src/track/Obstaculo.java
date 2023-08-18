package track;

public class Obstaculo {
	private String Tipo;
	private int lenght;
	private int damage;
	
	public Obstaculo(String pTipo) {
		this.Tipo=pTipo;
		lenght=6;
		damage=15;
	}
	
	public void chocar() {
		System.out.println("Has chocado con "+this.Tipo+"\nTamano: "+this.lenght+"\nDano: "+this.damage);
	}

}
