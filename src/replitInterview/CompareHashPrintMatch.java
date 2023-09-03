package replitInterview;

import java.util.HashSet;

public class CompareHashPrintMatch {

	public static void main(String[] args) {
		HashSet<String> color = new HashSet<>();
		color.add("Red");
		color.add("Green");
		color.add("Black");
		HashSet<String> colors = new HashSet<>();
		colors.add("Red");
		colors.add("Green");
		color.retainAll(colors);
		System.out.println(color);
		

	}

}
