package replitInterview;

public class removeSpace {

	public static void main(String[] args) {
		String str = "Welcome to all TekSchool students ... !!!";
		char[] arr = str.toCharArray();
		String tempStr = " ";
		for(char c:arr) {
			if(c != ' ') {
				tempStr += c;
			}
		}
		str = tempStr;
		System.out.println(str);
		
		System.out.println("-------------------------");
		 
		str= str.replaceAll(" ","");
		System.out.println(str);
			
	}

}
