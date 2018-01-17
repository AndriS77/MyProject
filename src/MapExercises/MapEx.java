package MapExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		MapEx me = new MapEx();
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("Valdur", 65);
		map1.put("Jana", 22);
		map1.put("Maða", 42);
		map1.put("Jüri", 22);

		System.out.println(Arrays.toString(me.getMapKeys(map1)));
		System.out.println(me.getMapKeysList(map1));
		System.out.println(Arrays.toString(me.getMapValues(map1)));
		System.out.println(me.getSetWithDuplicatedValues(map1));
		System.out.println(me.getDuplicated(map1));
		System.out.println(me.duplicated(map1));
		
	}

	// 1.Mapi kõik võtmed panna eraldi massiivi.
	public String[] getMapKeys(Map<String, Integer> map) {
		String[] keys = new String[map.size()];
		int index = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			keys[index] = entry.getKey();
			index++;

		}
		return keys;
	}

	// 1. ülesanne listiga
	public List<String> getMapKeysList(Map<String, Integer> map) {
		List<String> keys = new ArrayList<>();

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			keys.add(entry.getKey());

		}
		return keys;
	}

	// 2. Mapi väärtused saada eraldi massiivina.
	// Ainult sellised väärtused, mis on suuremad kui 30.
	public int[] getMapValues(Map<String, Integer> map) {
		int[] keys = new int[map.size()];
		int index = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			Integer value = entry.getValue(); 
			if (value > 30) {
				keys[index] = value;

				index++;
			}

		}
		return Arrays.copyOf(keys, index);
	}
	
	// 3. Saada mapist kätte dubleeritud (väärtused on mitmel korral esindatud) väärtustega paarid.
	
public Set<Integer> getSetWithDuplicatedValues(Map<String, Integer> map) {
		
		Collection<Integer> values = map.values();
		Set<Integer> duplicatedSet = new HashSet<>();
		
		for (Integer num : values) {
			if (Collections.frequency(values, num) > 1) {
				duplicatedSet.add(num);
			}
		}
		return duplicatedSet;
}

public Map<String, Integer> getDuplicated(Map<String, Integer> map) {
	
	Map<String, Integer> duplicates = new HashMap<String, Integer>();
	
	for (Map.Entry<String, Integer> entry : map.entrySet()) {
		if (Collections.frequency((Collection<?>) map.values(), entry.getValue()) > 1) {
			duplicates.put(entry.getKey(), entry.getValue());
		}
	}
	return duplicates;
}
	// 4. Eemalda kõik paarid, mille väärtused on mitmel korral esindatud.
	
	public Map<String, Integer> duplicated(Map<String, Integer> map) {
		
		Map<String, Integer> duplicates = new HashMap<String, Integer>();
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (Collections.frequency((Collection<?>) map.values(), entry.getValue()) == 1) {
				duplicates.put(entry.getKey(), entry.getValue());
			}
		}
		return duplicates;
}

}
