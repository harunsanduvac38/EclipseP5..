package string;

public class S12InsertarCadaTres {
	
	
	public static String insertTres(String cadena, String caracter) {
		
		String cadena2 = "";
		
		for(int i = 0; i< cadena.length(); i++) {
			
			if(i < 2 || i % 3 != 2  || i == cadena.length() -1) {
				cadena2 += cadena.charAt(i);
			}else
				cadena2 += cadena.charAt(i) + caracter;
		}
		
		
		return cadena2;
	}
	
	public static void main(String[] args) {
		System.out.println(insertTres("0123456789", "."));
	}

}
