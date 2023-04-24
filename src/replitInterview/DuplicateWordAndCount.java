package replitInterview;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordAndCount {
public static void main (String[]args) {
	String []words = { "test", "take", "nice", "pass", "test", "nice", "test" };
	Map<String,Integer> wordCounts = new HashMap<>();
	for(String word: words) {
		if(wordCounts.containsKey(word)) {
			wordCounts.put(word, wordCounts.get(word) + 1);
		}else {
			wordCounts.put(word,1);
		}
	}
	String [] duplicates = new String[wordCounts.size()];
	int[] counts = new int[wordCounts.size()];
	int index = 0;
	
	for(Map.Entry<String,Integer> entry: wordCounts.entrySet()) {
		if(entry.getValue()> 1) {
			duplicates[index] = entry.getKey();
			counts[index]= entry.getValue();
			index ++;
		}
	}
	for (int i = 0; i<index; i++) {
		System.out.println(duplicates[i]+ ":" + counts[i]);
	}
	
}
}
