package recursividad;

public class R08DecimalEnBinario {
	
	
	
	public static String decimalEnBinario(int num) {
		if(num == 0)
			return "0";
		if(num==1)
			return "1";
		
		return (num%2) + (decimalEnBinario(num/2));
	}
	
	
	public static void main(String[] args) {
		
	System.out.println(decimalEnBinario(42));
	}

}
