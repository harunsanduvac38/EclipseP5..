package string;

public class S08CadenaInvertida {
	
	public static void main(String[] args) {
		
		
		String cadena1 = "abcde";
		String cadena2 = "";
		
		for(int i = cadena1.length(); i>0; i--) {
			cadena2 += cadena1.substring(i -1, (i));
		}
		
		System.out.println(cadena2);
	}

}
