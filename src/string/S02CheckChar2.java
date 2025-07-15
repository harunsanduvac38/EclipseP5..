package string;
import java.util.Scanner;

public class S02CheckChar2 {
	
	public static boolean checkChar2(String cad) {
		
		if(cad.startsWith("h") || cad.startsWith("H")) {
			return true;
		}else {
			return false;
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa una cadena: ");
		String cad = teclado.nextLine();
		checkChar2(cad);
		
		System.out.println("Empieza por 'H' o 'h': " + S02CheckChar2.checkChar2(cad));
		
	}

}
