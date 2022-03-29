package ejercicio;

public class Electrodomestico {

	private int precioBase=100;
	private String color="blanco";
	private char consumo='A';
	private int peso=5;
	
	public Electrodomestico() {}
	
	public Electrodomestico(String color, char consumo, int peso) {
		super();
		setColor(color);
		setConsumo(consumo);
		this.peso = peso;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		//Lo pasamos a minuscula para evitar posibles fallos
		color=color.toLowerCase();
		
		if(comprobarColor(color)) {
			this.color = color;
		}
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		if(comprobarConsumoEnergetico(consumo)) {
			this.consumo = consumo;
		}
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public boolean comprobarConsumoEnergetico(char letra) {
		if(letra=='A' || letra=='B' || letra=='C') {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean comprobarColor(String color) {
		if(color.equals("negro") || color.equals("blanco") || color.equals("rojo") || color.equals("azul") || color.equals("gris")) {
			return true;
		}else {
			return false;
		}
	}
	
	public int precioFinal() {
		int plus=precioBase;
		switch(consumo) {
		
		case 'A':
			plus+=100;
			break;
		case 'B':
			plus+=80;
			break;
		case 'C':
			plus+=60;
			break;
		}
		
		if(peso>=0 && peso<=20) {
			plus+=10;
		}
		else if(peso>20 && peso<40) {
			plus+=50;
		}
		else if(peso>40) {
			plus+=80;
		}
		
		return plus;
	}

	@Override
	public String toString() {
		return "precio base=" + precioBase + "\ncolor=" + color + "\nconsumo=" + consumo + "\npeso="
				+ peso;
	}
}
