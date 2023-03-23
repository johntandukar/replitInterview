package replitInterview;

public class reverseString {

	public static void main(String[] args) {
		String str = "MyJava";
		char[] reverseResult = str.toCharArray();
		for( int i = reverseResult.length-1; i>=0; i--)
			System.out.print(reverseResult[i]);
		
		
		System.out.println();
		
		StringBuilder stringBuilderVariable = new StringBuilder();
		stringBuilderVariable.append(str);
		stringBuilderVariable.reverse();
		System.out.println("The reverse of MyJava is " + stringBuilderVariable);
		
		System.out.println();
		
		int iStrLength = str.length();
		while(iStrLength > 0)
		{
			System.out.print(str.charAt(iStrLength-1));
			iStrLength--;
		}
	}

}
