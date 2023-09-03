package replitInterview;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPrintTill7 {

	public static void main(String[] args) {
		TreeSet<Integer> num = new TreeSet<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		num.add(9);
		num.add(10);
		System.out.println("Tree set less than 7");
		TreeSet<Integer> nums = new TreeSet<>();
		nums = (TreeSet<Integer>)num.headSet(7);
		Iterator numbers = nums.iterator();
		while(numbers.hasNext()) {
			System.out.print(numbers.next() + " ");
		}

	}

}
