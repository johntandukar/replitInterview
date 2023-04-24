package replitInterview;

import java.util.ArrayList;

public class ArrayListEmptyOrNot {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList();
		color.add("Red");
		color.add("Green");
		color.add("Black");
		System.out.println("Original array list: " + color);
		boolean result = color.isEmpty();
		System.out.println("Checking tha above arrray list is empty or not:" + result);
		color.removeAll(color);
		System.out.println("Array list after remove all elements: " + color);
		result = color.isEmpty();
		System.out.println("Checking the above array list is empty or not: " + result);

	}

}
