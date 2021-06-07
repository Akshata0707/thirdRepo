package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Main1 {

	public static void main(String[] args) {
		TreeSet<Cities> city1 = new TreeSet<Cities>();
		TreeSet<Cities> city2 = new TreeSet<Cities>();
		HashMap<String, TreeSet<Cities>> state = new HashMap<String, TreeSet<Cities>>();

		Cities ct1 = new Cities("Gulbarga", 20000);
		Cities ct2 = new Cities("Bider", 10000);
		Cities ct3 = new Cities("Hubli", 50000);
		Cities ct4 = new Cities("Banglore", 30000);

		city1.add(ct1);
		city1.add(ct2);
		city2.add(ct3);
		city2.add(ct4);

		state.put("karnataka", city1);
		

		System.out.println(state);

	}

}
