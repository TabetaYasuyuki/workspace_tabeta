package hashMapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, String> l3 = new HashMap<>();
		System.out.println(l3.put(0,"奈良"));
		System.out.println(l3.put(1, "滋賀"));
		System.out.println(l3.put(0, "東京"));
		//System.out.println(l3);
		
		//System.out.println(l3.get(0));
		//System.out.println(l3.remove(0));
		//System.out.println(l3);
		
		Set<Integer> keys = l3.keySet();
		for(Integer key : keys) {
			System.out.print(key);
		}
		System.out.println();
		Collection<String> values = l3.values();
		for(String value : values) {
			System.out.print(value);
		}
		

	}

}
