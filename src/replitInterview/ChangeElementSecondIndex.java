package replitInterview;

import java.util.LinkedList;

public class ChangeElementSecondIndex {
	public static void main (String args[]) {
		LinkedList<String> color = new LinkedList();
		color.add("Red");
		color.add("Green");
		color.add("White");
		System.out.println(color);
		color.set(1,"Brown");
		System.out.println(color);
	}

}
