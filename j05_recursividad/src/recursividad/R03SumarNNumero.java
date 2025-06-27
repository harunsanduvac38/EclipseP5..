package recursividad;

public class R03SumarNNumero {
	
	public static int sumarNum(int n) {
		
		if(n == 1) return 1;
		return n + sumarNum(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(sumarNum(5));
		System.out.println(sumarNum(10));
	}

}
