package replitInterview;

public class combinationOfNumbers {

	public static void main(String[] args) {
		int count = 0;
		for( int i=1; i<= 5; i++) {
			for(int j = 1; j<= 5; j++) {
				for(int k = 1; k <=5; k++) {
					System.out.println(i + " " + j + " " + k);
				 count++;
				}
			
			}
		
		}System.out.println(count);
		
	}

}
