package replitInterview;

public class BlankSpaceCount {

	public static void main(String[] args) {
		String str = "Tek School of America";
		int space = 0;
		for (int i = 0; i<str.length(); i++) {
			//char ch = str.charAt(i);
			if(str.charAt(i)==' ') 
				space++;
			
		}
		System.out.println("Total number of white space: " + space);
	}

}
