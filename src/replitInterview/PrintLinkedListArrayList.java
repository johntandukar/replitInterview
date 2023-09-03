package replitInterview;

import java.util.LinkedList;

public class PrintLinkedListArrayList {

	public static void main(String[] args) {
		LinkedList<String> color = new LinkedList();
		color.add("Green");
		color.add("Red");
		color.add("Brown");
		for( int i = 0; i < color.size(); i++) {
			System.out.println(color.get(i));
		}
				
		

	}

}
