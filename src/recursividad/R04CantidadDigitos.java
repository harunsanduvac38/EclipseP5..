package recursividad;

public class R04CantidadDigitos {
	
	public static int cantDigit(int num) {
		
		if(num==0) {
			return 0;
		}else {
			return 1 + cantDigit(num/10);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(cantDigit(1234));
		
	}
}
