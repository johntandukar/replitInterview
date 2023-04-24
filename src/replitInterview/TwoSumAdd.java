package replitInterview;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumAdd {

	/*public static int[] sum(int[] nums, int target) {
		for(int i = 0; i< nums.length; i++) {
			int diff = target - nums[i];
			for(int j = i+1; j<nums.length; j++) {
				if(nums[j]==diff) {
					return new int[]{nums[i],nums[j]};
				}
			}
		}
		return null;*/
		public static int[] sum (int[] nums, int target) {
			int[]ans = new int[2];
			for (int i = 0; i< nums.length -1; ++i) {
				for(int j = i+1; j < nums.length-1; ++j) {
					if(nums[i] + nums[j] == target) {
						ans[0] = i;
						ans[1] = j;
					}
				}
			}
			return ans;
		}
		
		
	
	public static void main(String[]args) {
		int[] arr = {2,7,11,15};
		int num = 9;
		System.out.println(Arrays.toString(sum(arr,num)));
	}

}
