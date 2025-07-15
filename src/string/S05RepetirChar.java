package string;

import java.util.Scanner;

public class S05RepetirChar {
	
	public static void repetirChar (char car, int num) {
		String cadena = "";
		
		for (int i = 1; i <= num; i++) {
			cadena += car;
		}
		System.out.println(cadena);
	}
	
	public static void main(String[] args) {
		
		repetirChar('b', 20);
	}
}
