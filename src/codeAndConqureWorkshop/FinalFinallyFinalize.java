package codeAndConqureWorkshop;

public class FinalFinallyFinalize {
	public static void main(String[] args) {
		test1();
	}
	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("inside catch block");
		}
		finally
		{
			System.out.println("inside finally block");
		}
	}

}
