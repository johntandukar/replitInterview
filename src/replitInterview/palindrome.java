package replitInterview;

public class palindrome {

	public static void main(String[] args) {
		System.out.println("String Builder Method: " +(isPalindrome("rotor")));
		String name ="rotor";
		String reverse = "";
		
		for (int j = name.length()-1; j>=0;j--) {
			reverse += name.charAt(j);
		}
		if(name.equals(reverse)) {
			System.out.println("True");
		}else {
			System.out.println("false");
		}
		
			
		boolean isPalindrome = true;
		for(int i=0; i<name.length()/2; i++) {
			if(name.charAt(i) != name.charAt(name.length()-i-1)) {
				isPalindrome = false;
				break;
			}
		}
		if(isPalindrome) {
			System.out.print(isPalindrome);
		}else 
			System.out.println(isPalindrome);
	}

public static boolean isPalindrome(String str) {
	StringBuilder sb= new StringBuilder(str);
	sb.reverse();
	String rev=sb.toString();
	if(str.equals(rev)) {
		return true;
	}else {
		return false;
	}
}


	

}
	


