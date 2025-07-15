package string;

public class S09CadenaPalindromo {
	
	private String palabra;
	private boolean result;
	
	

	public S09CadenaPalindromo(String palabra) {
		this.palabra = palabra;
		this.result = controlPalindromo(palabra);
		
	
	}
	
	public static boolean controlPalindromo(String palabra) {
		if(palabra.length() <= 1) 
			return true;
		return palabra.charAt(0) == palabra.charAt(palabra.length() -1) && controlPalindromo(palabra.substring(1, palabra.length() - 1));
		
	}
	

	
	
	@Override
	public String toString() {
		if(result) {
			return "la palabra " + palabra + " es una palindromo";
		}else {
			return "la palabra " + palabra + " no es una palindromo";
		}
	}




	public static void main(String[] args) {
		S09CadenaPalindromo p1 = new S09CadenaPalindromo("123321 123321");
		
		System.out.println(p1);
	}

}
