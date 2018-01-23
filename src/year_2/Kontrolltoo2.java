package year_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kontrolltoo2 {

	public static void main(String[] args) {
		Kontrolltoo2 kt = new Kontrolltoo2();
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("August", 7);
		map2.put("Ivo", 5);
		map2.put("Tanel", 11);

		Map<String, Integer> map3 = new HashMap<String, Integer>();
		map3.put("Mait", 488750877);
		map3.put("Mati", 479575490);
		map3.put("Mari", 387569768);


		System.out.println(kt.startsWithA(map2));
		System.out.println(Arrays.toString(kt.getMapValues(map2)));

	}

	// ül 1.
	public List<String> startsWithA(Map<String, Integer> map) {
		List<String> keys = new ArrayList<>();

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getKey().startsWith("A")) {

				keys.add(entry.getKey());
			}

		}
		return keys;

	}

	// ül 3.
	public int[] getMapValues(Map<String, Integer> map) {
		int[] keys = new int[map.size()];
		int index = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			Integer value = entry.getValue();
			if (value < 10) {
				keys[index] = value;

				index++;
			}

		}
		return Arrays.copyOf(keys, index);
	}

	// ül 2.
	
	/* public Map<String,String> idNumber(Map<String, String> map) {
		 Map<String,String> Numbs= new HashMap<>();		 
	 for (String nums : map.keySet()) {
		map.put(str.substring-4);
	}
	 return map;
	 }
	 */
	// ül 4.
	public Map<String, String> aBC(Map<String, String> map) {
		if (map.containsKey("a") && map.containsKey("b")) {
			if(map.containsKey("c")) {
			map.remove("c");
			}else{
				//map.put("d");
			}


		}
		return map;
	}
}
