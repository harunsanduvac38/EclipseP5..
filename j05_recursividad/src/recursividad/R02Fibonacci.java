package recursividad;

public class R02Fibonacci {
	
//	
	
	
	
	public static long fibonacci(long num) {
		
		if(num==0) {
			return 0;
		}else if(num==1) {
			return 1;
		}else {
			return fibonacci(num-1) + fibonacci(num -2);
		
		}
	}
	
	
	
	public static int fibonacci2(int num) {
		return switch(num) {
		case 0 -> 0;
		case 1 -> 1;
		default -> fibonacci2(num-1) + fibonacci2(num-2);
		};
	}
	
	public static void main(String[] args) {
		System.out.println(fibonacci(2));
		
		System.out.println(fibonacci2(5));
	}

}
