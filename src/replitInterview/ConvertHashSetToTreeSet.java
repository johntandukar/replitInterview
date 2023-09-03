package replitInterview;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertHashSetToTreeSet {

		public static void main(String[] args) {
		HashSet<String> color = new HashSet();
		color.add("Red");
		color.add("White");
		color.add("Pink");
		color.add("Yellow");
		Set<String> colors = new TreeSet<>(color);
		for(String c: colors) {
			System.out.println(c);
		}
	}

}
