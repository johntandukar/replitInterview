package replitInterview;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElements {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList();
		color.add("Red");
		color.add("Green");
		color.add("Black");
		color.add("White");
		color.add("Pink");
		System.out.println(color);
		Collections.swap(color,0,2);
		System.out.println(color);

	}

}
