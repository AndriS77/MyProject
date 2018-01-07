package year_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Kodutoo2 {

	public static void main(String[] args) {

		Kodutoo2 kt = new Kodutoo2();

		HashMap<Integer, String> persons = new HashMap<>();
		persons.put(2, "Indrek");
		persons.put(17, "Ander");
		persons.put(3, "Mati");

		System.out.println(lowestKeyValue(persons, "Jüri"));
		System.out.println(kt.ChangeValue(persons, 'A', 6, "Jaan"));

	}

	// Ül 1:
	public static Map<Integer, String> lowestKeyValue(Map<Integer, String> map, String newValie) {
		List<Integer> keys = new ArrayList<>();
		map.forEach((k, v) -> {
			keys.add(k);
		});
		map.put(Collections.min(keys), newValie);
		return map;
	}

	// Ül 2:
	public static Map<Integer, String> ChangeValue(HashMap<Integer, String> map,Character letter,int length,String newValue) {
		/*for (Iterator it = map.values().iterator(); it.hasNext();) {
			Object value = it.next();
			// if(Map.containsValue(str.s))*/
		map.forEach((k,v)->{
			if(v.length() < length && v.startsWith(letter.toString())){
				map.put(k, newValue);
			}
		});
		return map;
	}
}
