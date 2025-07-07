package string;

public class S13InsertarOtro {
	
	public static String insertarCar(String cadena, String caracter, int cuanto) {
		
		String cadena2 = "";
		
for(int i = 0; i< cadena.length(); i++) {
			
			if(i < cuanto-1 || i % cuanto != cuanto-1  || i == cadena.length() -1) {
				cadena2 += cadena.charAt(i);
			}else
				cadena2 += cadena.charAt(i) + caracter;
		}
		
		return cadena2;
	}
	
	public static void main(String[] args) {
		System.out.println(insertarCar("haraundsfasdfasdfaa", "/", 3));
	}

}
