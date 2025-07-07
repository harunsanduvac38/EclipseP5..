package string;


public class S10Sigla {
	
	public static String retornerSigla(String frase) {
		String[] palabras = frase.split(" ");
		String sigla = "";
		
		for(int i = 0; i < palabras.length; i++) {
			sigla += palabras[i].charAt(0);
		}
		
		return sigla.toUpperCase();
		
	}
	
	public static void main(String[] args) {
		System.out.println(retornerSigla("Harun Sadnuvasd sdfasdf"));
		System.out.println(retornerSigla("Unoiversal serial bus"));
	}

}
