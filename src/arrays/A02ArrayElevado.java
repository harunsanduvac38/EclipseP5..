package arrays;
import java.util.Arrays;



public class A02ArrayElevado {
	
	public static int[] arrayElevado(int... nums) {
	    int[] nums2 = new int[nums.length];
	    for (int i = 0; i < nums.length; i++) {
	        nums2[i] = (int) Math.pow(nums[i], 2);
	    }
	    return nums2;
	}
	
	
	

	public static void main(String[] args) {
	    int[] result = arrayElevado(3, 4, 5, 6);
	    System.out.println(Arrays.toString(result));
	}

	
	

}
