package ejercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer= new Scanner(System.in);
		
		System.out.println("Vamos a construir una lavadora");
		System.out.println("Elige un color entre: negro, blanco, rojo, azul y gris.");
		String color=leer.next();
		System.out.println("¿Qué consumo tiene? A/B/C");
		char consumo=leer.next().toUpperCase().charAt(0);
		System.out.println("¿Cuánto pesa?");
		int peso=leer.nextInt();
		System.out.println("¿Cuál es su carga?");
		int carga=leer.nextInt();
		
		Lavadora lavadora= new Lavadora(color, consumo, peso, carga);
		
		System.out.println(lavadora);
		System.out.println("Precio final="+ lavadora.precioFinal());
	}

}
