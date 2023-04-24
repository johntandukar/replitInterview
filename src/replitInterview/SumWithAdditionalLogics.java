package replitInterview;
import java.util.Scanner;
public class SumWithAdditionalLogics {
	public static int sum(int a, int b, int c){
		//int sum = a + b + c;
		//if(a == 10 || b == 10 || c == 10) {
		//	sum -= 10;
		//	System.out.println("One of the number is 10");
		//}else {
			//System.out.println("Sum or three number is: ");
	
		//}
		//return sum;
		//int sums = 0;
		//if(a!= 10) {
			//sums += a;
		//}
		//if(b != 10) {
			//sums += b;
		//}
		//if(c != 10) {
			//sums +=c;
		//}
		//return sums;
		if(a == 10 || b == 10 || c == 10) {
			System.out.println("one of the integer is 10, cannot calculate sum");
			return 0;
		}else {
			return a + b + c;
		}
	}
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter the third number: ");
		int num3 = sc.nextInt();
		int result = sum(num1,num2,num3);
		System.out.print("The sum of three numbers : " + result);
		sc.close();
			
	}

}
