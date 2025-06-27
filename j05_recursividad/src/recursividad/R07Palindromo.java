package recursividad;

public class R07Palindromo {
	
//	public static boolean numPalindromo (int num) {
//		
//		System.out.println("num " +num);
//		
//		if(num < 10) {
//			return true;
//		}else {
//			return (num/((int)Math.pow(10, R04CantidadDigitos.cantDigit(num) - 1)) == num%10) && numPalindromo((num%(int)Math.pow(10, R04CantidadDigitos.cantDigit(num)-1))/10);
//		}
//	}
	
	public static boolean numPalindromo2(String cad) {
		
		
		if(cad.length()<=1 ) {
			return true;
		}else {
			
			return cad.charAt(0) == cad.charAt(cad.length()-1) && numPalindromo2(cad.substring(1, (cad.length()-1)));
		}
		
	}
	
		
	
	
	public static void main(String[] args) {
//		System.out.println(numPalindromo(34677643));
		System.out.println(numPalindromo2("abcba"));
		
	}

}
