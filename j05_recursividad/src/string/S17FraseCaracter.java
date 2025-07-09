package string;

import java.util.ArrayList;

public class S17FraseCaracter {
	
	
	public static ArrayList<Integer> posCaracter(String frase, char caracter) {
		ArrayList<Integer> posiciones = new ArrayList<>();
		
		char[] fraseChar = frase.toCharArray();
		
		
		for(int i = 0; i<fraseChar.length;i++) {
			if(fraseChar[i] == caracter) {
				posiciones.add(i);
			}
		}
		return posiciones;
	}
	
	
	public static void main(String[] args) {
		System.out.println(posCaracter("harun sanduvac", 'a'));
	}

}
