package javapackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		//ArrayList<String> names = new ArrayList<String>();
		List<String> names = new ArrayList<String>();
		
		// array list methods to add or remove values from list.
		names.add("Arun");
		names.add("Uday");
		names.add("Kiran");
		names.add("Pawan");
		names.add("Sujay");;
		names.remove("Uday");
		names.remove(0);
		names.add(0, "Ranga");
		names.add(2, "Sailaja");
		names.add("jittu");
		System.out.println(names);
		
		for (int i = 0; i < 5; i++) { // set or add values
			names.add(i, "name");
			
		}// For get values
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		//Iterator methods to get values -- Like for 
		Iterator<String> iteration = names.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}
	}

}
