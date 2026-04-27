package day29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapPractice9 {

	public static void main(String[] args) {

		HashMap<String, Object> hm2 = new HashMap<String, Object>();

		hm2.put("Name", "Shrey");
		hm2.put("Initials", "SB");
		hm2.put("Age", 27);
		hm2.put("DOB", 26.04);
		hm2.put("Graduated", true);
		hm2.put("Married", null);

		System.out.println("Printing the value from HashMap: ");

		Iterator<Entry<String, Object>> it = hm2.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Object> entry = it.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

	}

}
