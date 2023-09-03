package codeAndConqureWorkshop;

import java.util.ArrayList;
import java.util.Hashtable;

public class ArrayListConcept {
public static void main (String[]args) {
	ArrayList ar = new ArrayList();
	ar.add(100);
	ar.add(200);
	ar.add(300);
	System.out.println(ar.size());
	System.out.println(ar.get(2));
	
	Hashtable h = new Hashtable();
	h.put("A", "Test");
	h.put("B", "Hello");
	System.out.println(h.size());
	
	ArrayList<String> ar5 = new ArrayList<String>();
	ar5.add("test");
	ar5.add("test1");
	for(int i=0; i<ar5.size(); i++) {
		System.out.println(ar5.get(i));
	}
	
	
}
}
