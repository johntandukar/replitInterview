package replitInterview;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPrintWhileLoop {

	public static void main(String[] args) {
		HashSet<String> color = new HashSet();
		color.add("Green");
		color.add("Blue");
		color.add("Red");
		Iterator<String> colors = color.iterator();
		while(colors.hasNext()) {
			System.out.println(colors.next());
		}

	}

}
