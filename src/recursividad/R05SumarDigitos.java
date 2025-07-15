package recursividad;

public class R05SumarDigitos {
	
	public static int sumDig (int num) {
		
		if(num <= 9) {
			return num;
		}else {
			return num%10 + sumDig(num/10);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(sumDig(12345));
	}

}
