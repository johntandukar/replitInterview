package replitInterview;
import java.util.*;
import java.util.ArrayList;

public class CompareArrayWithYesNoOutput {

	public static void main(String[] args) {
		ArrayList<String> colors= new ArrayList();
	colors.add("Red");
		colors.add("Green");
		colors.add("Black");
		colors.add("White");
		colors.add("Pink");
		
		ArrayList<String> color = new ArrayList();
		color.add("Red");
		color.add("Green");
		color.add("Black");
		color.add("Pink");
		
		ArrayList<String> result = new ArrayList();
		for(String temp : colors)
			result.add(color.contains(temp) ? "Yes" : "No");
		System.out.println(result);
		
		
		
	
	}

}
