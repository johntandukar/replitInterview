package replitInterview;

import java.util.ArrayList;

public class PrintArrayListWithForLoop {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList();
		color.add("Red");
		color.add("Green");
		color.add("Black");
		color.add("White");
		color.add("Pink");
		for(int i = 0; i < color.size(); i++)
			System.out.println(color.get(i));
	}

}
