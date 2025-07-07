package string;

public class S11Insertar {
	
	public static String insertarCar(String frase, String caracter) {
		
		String frase2 = "";
		
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == ' ' || i == frase.length() -1 || frase.charAt(i + 1) == ' ') {
				frase2 += frase.charAt(i); 
			}else
				frase2 += frase.charAt(i)+ caracter;
		}
		
		
		
		return frase2;
	}
	
	
	public static void main(String[] args) {
		System.out.println(insertarCar("harun sanduvac", "-"));
		System.out.println(insertarCar("hasrun sanduvac sdfasdf sdfasfd", "-"));
	}

}
