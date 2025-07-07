package string;

public class S07ContarVocales {
	
	public static void main(String[] args) {
		
		char[] vocales = new char[] {'a', 'e', 'i', 'o', 'u'};
		
		int cantVocal = 0;
		
		String texto = "harun sanduvac";
		
//		for(int i = 0; i < texto.length(); i++)
//			for(int y = 0; y < 5; y++) 
//				if(texto.charAt(i) == vocales[y])
//					cantVocal++;
		
		for(int i = 0; i< texto.length(); i++) {
			if("aeiou".contains(String.valueOf(texto.charAt(i)))) {
				cantVocal++;
			}
		}
		
		
		
		System.out.println(cantVocal);
		
	}

}
