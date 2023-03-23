package replitInterview;
import java.util.Scanner;

public class pyramidUserInput {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("How many rows you want in your Pyramids?");
	int num = sc.nextInt();
	int rowCount = 1;
	//print empty space at the beginning of the row
	for(int i = num; i > 0; i--) {
		for(int j = 1; j<=i; j++) {
			System.out.print(" ");
		}
		for (int k= 1; k<= rowCount; k++) {
			System.out.print(rowCount + " ");
		}
	System.out.println();
		rowCount++;
	}
		
	
	}
	
	
	
		
	}


