package replitInterview;

import java.util.Arrays;

public class RemoveDuplicateInteger {
public static int[] removeDuplicate(int[]arr) {
	int[]result = new int[arr.length];
	int j = 0;
	for(int i = 0; i<arr.length-1;i++) {
		if(arr[i] != arr[i+1]) {
			result[j++] = arr[i];
		}
	}
	result[j++] = arr[arr.length-1];
	int[] finalResult = new int[j];
	for(int i= 0; i<j; i++) {
		finalResult[i] = result[i];
	}
	return finalResult;
}
public static void main (String[]args) {
	int[] nums = {1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 8};
	int[] result = removeDuplicate(nums);
	System.out.println(Arrays.toString(result));
}

}
