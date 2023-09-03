package replitInterview;

import java.util.Scanner;
import java.util.TreeSet;

public class RemoveNumberTreeSetScanner {

	public static void main(String[] args) {
		TreeSet<Integer> nums = new TreeSet<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		nums.add(60);
		System.out.println(nums);
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Remove " + num + " from the tree set: " + nums.remove(num));
		System.out.println(nums);
	}

}
