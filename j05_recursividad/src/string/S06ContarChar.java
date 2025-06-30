package string;

import java.util.Scanner;



public class S06ContarChar {
	
	public static int contarChar(String frase, char car) {
		
		int cantCar = 0;
		
			for(int i = 0; i< frase.length(); i++) {
				if(frase.charAt(i) == car) {
					cantCar++;
			}
		}
		
		
		
		return cantCar;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una frase: ");
		String frase = teclado.nextLine();
		System.out.println("Escribe un carácter: ");
		char car = teclado.nextLine().charAt(0);
		
		contarChar(frase, car);
		System.out.println("Carácter '" + car + "' está " + contarChar(frase, car) + " veces");
		
	}

}
