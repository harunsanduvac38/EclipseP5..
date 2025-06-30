package string;
import java.util.Scanner;

public class S03EscribirChar {
	
	public static void escribirChar(String cad) {
		
		for(int i= 0; i< cad.length(); i++){
			
			System.out.println(cad.charAt(i));
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe una cadena: ");
		String cad = teclado.nextLine();
		escribirChar(cad);
	}

}
