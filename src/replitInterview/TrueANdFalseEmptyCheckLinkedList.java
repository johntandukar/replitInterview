package replitInterview;

import java.util.LinkedList;

public class TrueANdFalseEmptyCheckLinkedList {

	public static void main(String[] args) {
		LinkedList<String> color = new LinkedList();
		color.add("Red");
		color.add("Green");
		color.add("Violet");
		System.out.println(color);
		System.out.println(color.isEmpty());
		color.removeAll(color);
		System.out.println(color.isEmpty());
		

	}

}
