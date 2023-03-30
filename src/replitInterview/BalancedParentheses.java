package replitInterview;

import java.util.Stack;

public class BalancedParentheses {
public static boolean isBalanced(String str) {
	Stack<Character> temp = new Stack<>();
	for(char c: str.toCharArray()) {
		if(c =='(' || c == '{' || c == '[') {
			temp.push(c);
		}else if( c == ')' || c == '}' || c == ']') {
			if(temp.isEmpty()) {
				return false;
			}
			char top = temp.pop();
			if((c==')' && top != '(' ) || (c == ']' && top!= '[') || ( c== '}' && top!= '{')) {
				return false;
			}
		}
	}
	return temp.isEmpty();
}
public static void main (String[]args) {
	String sample1 = "()()()()()()()()()()()";
	String sample2 = "(((()()()(()))))";
	String sample3 = ")((()()()(()))))";
	String sample4 = "<(()){}{<((({{{{}}}})))>()<>()}>";
	String sample5 = "<{[()]}>";
	String sample6 = "<{[(test)(test2)]}>";
	String sample7 = null;
	
	System.out.println(isBalanced(sample1));
		System.out.println(isBalanced(sample2));
			System.out.println(isBalanced(sample3));
				System.out.println(isBalanced(sample4));
					System.out.println(isBalanced(sample5));
						System.out.println(isBalanced(sample6));
							System.out.println(isBalanced(sample7));
}
}
