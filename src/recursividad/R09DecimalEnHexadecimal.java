package recursividad;

public class R09DecimalEnHexadecimal {
	
	public static String decimalEnHexa (int num) {
		
		String[] hexas = {"0", "1", "2", "3", "4", "5","6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
		
		if(num<= 15)
			return hexas[num];
		String result = (hexas[num%16]) + decimalEnHexa(num/16);
		
		
		
		String result2 = "";
		for(int i = 0; i< result.length(); i++) {
			result2 += String.valueOf(result.charAt(result.length() - i)); 
		}
		return result2;
		
		
	}



	
	
	
	
	public static void main(String[] args) {
		System.out.println(decimalEnHexa(17));
	}

}
