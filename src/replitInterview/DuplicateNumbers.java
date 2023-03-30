package replitInterview;

public class DuplicateNumbers {

	public static void main(String[] args) {
		int [] arr ={ 2, 5, 4, 9, 3, 2, 5, 9, 4 };
		for(int i = 0; i < arr.length; i++) {
			for(int j =i +1; j<arr.length; j++) {
				if(arr[i] == arr[j])
					System.out.print(arr[j]+ ",");
			}
		}
	

	}

}
