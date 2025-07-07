package string;

public class S14ToUpperCase {
	
	
	public static String toMayusculas (String frase) {
		String frase2 = "";
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == ' ') {
				frase2 += " " + Character.toUpperCase(frase.charAt(i+1)) ;
			}else
				frase2 += frase.charAt(i);
				
			
			
		}
		
		return frase2;
	}
	
	public static void main(String[] args) {
		System.out.println(toMayusculas("asdf asdfasdfasdf asdf"));
	}

}
