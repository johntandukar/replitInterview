package replitInterview;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("red");
		arr.add("Green");
		arr.add("Orange");
		arr.add("White");
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);

	}

}
