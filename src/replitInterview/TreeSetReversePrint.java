package replitInterview;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetReversePrint {

	public static void main(String[] args) {
		TreeSet<String> color = new TreeSet<>();
		color.add("Red");
		color.add("Green");
		color.add("Black");
		Iterator colors = color.descendingIterator();
		while(colors.hasNext()) {
			System.out.println(colors.next());
		}
	}

}
