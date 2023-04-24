package replitInterview;

import java.util.LinkedList;

public class RemoveElementsFromLinkedList {

	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList();
		colors.add("Red");
		colors.add("Green");
		colors.add("Black");
		colors.add("Pink");
		colors.add("orange");
		System.out.println("The original linked list: " + colors);
		System.out.println("Element removed: " + colors.get(0));
		System.out.println("Element removed: " + colors.get(4));
		colors.remove("Red");
		colors.remove("orange");
		System.out.println(colors);

	}

}
