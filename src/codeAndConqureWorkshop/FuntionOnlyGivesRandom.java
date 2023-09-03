package codeAndConqureWorkshop;

public class FuntionOnlyGivesRandom {

	public static void main(String[] args) {
		//lowercase character
		//uppercase character
		//numbers
		//special character
		String str = "TekSchool 01 $#@1 94849^^";
		System.out.println(numbers(str));

	}
	public static String numbers(String input) {
		return input.replaceAll("[^0-9]","");
	}
	public static String lowerCaseString(String input) {
		return input.replaceAll("[a-z]","");
	}

}
