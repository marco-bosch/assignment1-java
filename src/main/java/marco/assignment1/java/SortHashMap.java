package marco.assignment1.java;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> name = new HashMap<Integer, String>();

		name.put(4, "Chandan");
		name.put(1, "Marco");
		name.put(11, "Ririn");
		name.put(2, "Adi");

		System.out.println("Initial Data ");

		for (Entry<Integer, String> entry : name.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

//		// add 1 more data to ensure the order of output
//		// without this additional data the output already sorted by keys
		name.put(20, "Tata");

		Set<Entry<Integer, String>> beforeSort = name.entrySet();
		System.out.println("\n" + "Before Sorting with additional data ");

		for (Entry<Integer, String> entry : beforeSort) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

		TreeMap<Integer, String> newData = new TreeMap<>(name);
		Set<Entry<Integer, String>> afterSort = newData.entrySet();

		System.out.println("\n" + "After Sorting with additional data ");

		for (Entry<Integer, String> mapping : afterSort) {
			System.out.println(mapping.getKey() + "  " + mapping.getValue());
		}
	}

}
