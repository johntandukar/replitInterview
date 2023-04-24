package replitInterview;

import java.util.LinkedList;

public class ReverseElementPrintArray {

	public static void main(String[] args) {
		LinkedList<String> color = new LinkedList();
		color.add("REd");
		color.add("Green");
		color.add("Black");
		for(int i = color.size()-1; i>=0; i--)
			System.out.println(color.get(i));

	}

}
