package replitInterview;
import java.util.*;
public class countWordAndCharacters {
public static void main (String[] args) {
	String str = "This is a test of test";
	Map<String, Integer> map = new HashMap<>();
	String[] words = str.split(" ");
	for (String word: words) {
		Integer integer = map.get(word);
		if(integer == null)
			map.put(word, 1);
		else {
			map.put(word,integer + 1);
		}
	}
	System.out.println(map);
	
	for (String word: words) {
		if(map.containsKey(word))
			map.put(word,map.get(word) + 1);
		else
			map.put(word,1);
		
	}
	System.out.println(map);
}
}
