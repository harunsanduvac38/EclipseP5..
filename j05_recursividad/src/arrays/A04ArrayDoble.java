package arrays;

import java.util.Arrays;

public class A04ArrayDoble {
	
	public static int[] arrayDoble(int... nums) {
		
		int[] nums2 = new int[nums.length * 2];
		for (int i = 0; i< nums.length; i++) {
			nums2[i] = nums[i];
			if(i==nums.length) {
				for(int y = i; y<nums2.length;i++) {
					nums2[y] = 0;
				}
			}
		}
		return nums2;
	}
	
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(arrayDoble(1,2,3,4,5)));
		System.out.println(Arrays.toString(arrayDoble(1,2,3,4,5,4,5,6,7)));
	}

}
