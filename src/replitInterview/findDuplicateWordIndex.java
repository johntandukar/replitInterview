package replitInterview;

public class findDuplicateWordIndex {

	public static void main(String[] args) {
		String [] array = { "test", "take", "nice", "pass", "test", "nice" };
		for(int i = 0; i<array.length; i ++) {
			for( int j = i+1; j<array.length; j++) {
				if(array[i].equals(array[j])) {
					System.out.println(array[i] + " "+ i + " " + j);
				}
			}
		}
	}

}
