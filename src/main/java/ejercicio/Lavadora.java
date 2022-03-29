package ejercicio;

public class Lavadora extends Electrodomestico{

	private int carga=5;

	public Lavadora() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lavadora(String color, char consumo, int peso, int carga) {
		super(color, consumo, peso);
		// TODO Auto-generated constructor stub
		this.setCarga(carga);
	}

	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public int precioFinal() {
		int plus=super.precioFinal();
		
		if(carga>30) {
			plus+=50;
		}
		
		return plus;
	}

	@Override
	public String toString() {
		return super.toString()+"\ncarga=" + carga;
	}
}
