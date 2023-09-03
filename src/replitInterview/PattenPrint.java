package replitInterview;

public class PattenPrint {

	public static void main(String[] args) {
		int rows = 6;
		for(int i =1; i<= rows; ++i) {
			for(int j = 1; j<= i; ++j) {
				System.out.print("* ");
			}
			System.out.println();
		}
		int row = 5;
		for(int i = row; i>=1; i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
