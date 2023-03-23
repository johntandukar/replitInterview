package replitInterview;

public class countCharacters {

	public static void main(String[] args) {
		String str = "wefeqf878979797fewfewrf879797efds&^&^*^*^";
		int count = 0;
		for( int i = 0; i < str.length(); i++) {
			if(Character.isLetter(str.charAt(i)))
				count++;
		}
		System.out.println("The number of characters are: " + count);
	}

}
