package string;

import java.util.Scanner;

public class S04ComprobarChar {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese una frase: ");
		String frase = teclado.nextLine();
		System.out.println("Ingrese un carácter: ");
		char car = teclado.nextLine().charAt(0);
		
		combrobarChar(frase, car);
		
		
	}
	
	public static void combrobarChar (String frase, char car) {
		
		if(frase.indexOf(car) == -1) {
			System.out.println("La frase '" + frase + "' no contine '" + car + "'");
		}else {
			System.out.println("La frase '" + frase + "' contine '" + car + "'");
		}
	}
	

}
