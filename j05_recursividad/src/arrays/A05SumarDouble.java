package arrays;

import java.util.Arrays;

public class A05SumarDouble {
	
	public static double[] sumarDoubles(double[] nums1, double[] nums2) {
		
			
		double[] nums3 = new double[nums1.length];
		
		if(nums1.length == nums2.length) {
			for(int i = 0; i< nums1.length; i++) {
				nums3[i] = nums1[i] + nums2[i];
			
			}
		}else {
			System.out.println("ingresa dos arrays de tamaño igual.");
		}
		
		return nums3;
	}
	
	public static void main(String[] args) {
		
	
		double[] numeros1 = {234.23, 543.63, 654.77};
		double[] numeros2 = {111.11, 222.11, 453};
		System.out.println(Arrays.toString(sumarDoubles(numeros1, numeros2)));
	}

}
