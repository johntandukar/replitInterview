package replitInterview;

public class worlingWithArray {

	public static void main(String[] args) {
		int[] nums = { 1, 121, 321, 5, 11, 5, 12, 15, 1, 21, 5, 21, 113, 5, 111, 2, 1 };
		System.out.println(largestValue(nums));
		System.out.println(smallestValue(nums));
	System.out.println(sumOfNumbers(nums));
	System.out.println(aveOfSum(nums));
	System.out.println(secondLargest(nums));
	System.out.println(secondSmallest(nums));
	

	}
	public static int largestValue(int[]nums) {
		int largest =  nums[0];
		for(int i =1; i <nums.length; i++) {
			if(nums[i]>largest)
				largest = nums[i];
		}
		return largest;

}
	public static int smallestValue(int[]nums) {
		int smallest = nums[0];
		for(int i=1; i<nums.length; i++) {
			if(nums[i]<smallest)
				smallest = nums[i];
		}
		return smallest;
	}
	public static int sumOfNumbers(int[]nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++){
			sum += nums[i];
		}
		return sum;
	}
	public static double aveOfSum(int []nums) {
		return (double) sumOfNumbers(nums)/nums.length;
	}
	public static int secondLargest(int []nums) {
		int secLargest = nums[0];
		int largest = largestValue(nums);
		for(int i = 0; i< nums.length; i++) {
			if(nums[i]> secLargest && nums[i]< largest) {
				secLargest = nums[i];
			}
		}
		return secLargest;
	}
	public static int secondSmallest(int[]nums) {
		int secSmallest = Integer.MAX_VALUE;
		int smallest = Integer.MAX_VALUE;
		for(int i = 1; i <nums.length; i++) {
			if(nums[i]< smallest) {
				secSmallest = smallest;
			smallest = nums[i];
		}else if (nums[i] < secSmallest && nums[i] != smallest) {
				secSmallest = nums[i];
			}
			
		}
		return secSmallest;
}
	}

