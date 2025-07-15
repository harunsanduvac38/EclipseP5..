package recursividad;

public class R06CalcularPotencia {
	public static int calPotencia(int num1, int num2) {
		if(num1 <= 1 || num2 == 0) {
			return 1;
		}else {
			return num1 * calPotencia(num1, ((num2)-1));
		}
	}
	
	public static void main(String[] args) {
		System.out.println(calPotencia(2, 10));
	}

}
