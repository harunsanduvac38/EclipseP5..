package arrays;





public class A01MostrarArray {
	
	public static void mostrarArray(int num) {
		
		int[] nums = new int[num];
	
		
		for(int i = 0; i < num; i++) {
			nums[i] = (int)((Math.random() * 20000) +10000);
			
			if(i==0) {
				System.out.print("[" + nums[i]);
			}if(i==num-1) {
				System.out.print(", " + nums[i] + "]");
			}else {
				System.out.print(", " + nums[i]);
			}
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		mostrarArray(7);
	}

}
