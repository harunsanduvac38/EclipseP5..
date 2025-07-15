package string;
import java.util.Scanner;

public class S01CheckChar {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("ingresa una cadena: ");
		String cad = teclado.nextLine();
		
		if(cad.startsWith("H")) {
			System.out.println("Empieza por H");
		}else {
			System.out.println("No empieza por H");
		}
		
	}
	
	
	 

}
