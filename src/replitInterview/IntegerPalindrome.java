package replitInterview;

public class IntegerPalindrome {

	
		public static boolean isPalindrome(String num) {
			 String rev = "";
			  boolean ans = false;

			  for(int i = num.length()-1; i>=0; i-- ){
			    rev = rev + num.charAt(i);
			  }
			  if( rev.equals(num)){
			    ans= true;
			  }
			  return ans;
			}
			  public static void main(String []args){
			    int num = 121;
			  }
		

	}


