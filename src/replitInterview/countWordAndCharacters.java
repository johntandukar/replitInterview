package replitInterview;
import java.util.*;
public class countWordAndCharacters {
public static void main (String[] args) {
	String str = "This is a test of test";
	//countChar(str);
	Map<String, Integer> map = new HashMap<>();
	
		
	String[] words = str.split(" ");
	/*for (String word: words) {
		Integer integer = map.get(word);
		if(integer == null)
			map.put(word, 1);
		else {
			map.put(word,integer + 1);
		}
	}
	System.out.println(map);*/
	
	for (String word: words) {
		if(map.containsKey(word))
			map.put(word,map.get(word) + 1);
		else
			map.put(word,1);
		
	}
	System.out.println(map);
	Map<Character,Integer> countChar = new HashMap<>();
	for (int i = 0; i< str.length(); i++) {
		if(countChar.containsKey(str.charAt(i))) {
			countChar.put(str.charAt(i),countChar.get(str.charAt(i))+ 1);
			
		}else {
			countChar.put(str.charAt(i),1);
		}
	}
	System.out.println(countChar);
}
/*public void countChar(String str) {
	HashMap<Character, Integer> countChar = new HashMap<Character, Integer>();
char [] charArray = str.toCharArray();
for(char ch: charArray) {
	if(countChar.containsKey(ch))
	{
		countChar.put(ch,countChar.get(ch)+1);
	}
	else
	{
		countChar.put(ch,1);
	}
}
}*/
}

