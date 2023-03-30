package replitInterview;

public class PalindromeSecondPart {
	public static boolean isPalindrome(String str){
		   StringBuilder sb = new StringBuilder(str);
		   sb.reverse();
		   String rev=sb.toString();
		   if(str.equals(rev)){
		     return true;
		   }else{
		     return false;
		   }
		 }
		  public static boolean isPalindromeReverse(String str){
		    String reverse ="";
		    for (int j = str.length()-1; j>=0; j--){
		      reverse += str.charAt(j);
		    }
		    if(str.equals(reverse)){
		      return true;
		    }else {
		      return false;
		    }
		  }
		  public static boolean isPalForLoop(String str){
		    boolean isPalindrome = true;
		    for(int i =0; i < str.length()/2; i++){
		      if(str.charAt(i) != str.charAt(str.length()-i-1)){
		        isPalindrome = false;
		        break;
		   }
		    }if(isPalindrome){
		      return true;
		    }else{
		      return false;
		    }
		  }
		public static void main(String [] args){
		  System.out.println("String Builder Method= " + (isPalindrome("rotor")));
		  System.out.println("String reverse method = " +(isPalindromeReverse("rotor")));
		  System.out.println("For loop method = " + (isPalForLoop("rotor")));
		}

}
