package arrays;

import java.util.Arrays;

public class A03ArrayAlReves {
	
	public static int[] arrayAlReves(int...nums) {
		
		int[] nums2 = new int[nums.length];
		
		 for (int i = 0; i < nums.length; i++) {
		        nums2[i] = nums[nums.length - 1 - i];
		    }
		return nums2;
	}
	
	public static void main(String[] args) {
		
		int[] numeros = {4,5,6,7,8};
		
		System.out.println("Numeros en orden: " + Arrays.toString(numeros));
		System.out.println("Numeros al Reves: " + Arrays.toString(arrayAlReves(numeros)));
		
	}
	

	

}
