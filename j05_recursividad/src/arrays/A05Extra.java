package arrays;

import java.util.Arrays;
import java.util.List;

public class A05Extra {
	
	public static double[] sumarArrays (double[] nums1, double[] nums2) {
		double[] nums3 = new double[0];
		
		if(nums1.length > nums2.length) {
			double[] nums2Nuevo = new double[nums1.length]; 
			nums3 = new double[nums1.length];
			
			for(int i = 0; i<nums2.length; i++) {
				
			}
			
			for(int i = 0; i<nums1.length;i++) {
				if(i<nums2.length) {
					nums2Nuevo[i] = nums2[i];
				}
				nums3[i] = nums1[i] + nums2Nuevo[i];
			}
		}else {
			double[] nums1Nuevo = new double[nums2.length]; 
			nums3 = new double[nums2.length];
			
			for(int i = 0; i<nums1.length; i++) {
				
			}
			
			for(int i = 0; i<nums2.length;i++) {
				if(i<nums1.length) {
					nums1Nuevo[i] = nums1[i];
				}
				nums3[i] = nums2[i] + nums1Nuevo[i];
			}
			
		}
		
		return nums3;
		
		
	}
	
	
	public static void main(String[] args) {
		
		double[] array1= {234.5,54.6};
		double[] array2= {234.5,54.6, 4234, 453};
		
		System.out.println(Arrays.toString(sumarArrays(array1, array2)));
	}
}
