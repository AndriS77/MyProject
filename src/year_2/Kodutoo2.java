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
		persons.put(17, "Kalmer");
		persons.put(3, "Mati");
		
		System.out.println(lowestKeyValue(persons, 5));
		System.out.println(AValue(persons));
		
		}
		//Ül 1
		public static Map<Integer,String> lowestKeyValue(Map<Integer,String> map, int key){
			List<Integer> keys = new ArrayList<>();
			map.forEach((k,v)->{
				keys.add(k);});
			int lowest = Collections.min(keys);
			map.put(key,map.get(lowest));
			map.remove(lowest);
			return map;
			}

		//Ül 2:
		public static Map<Integer,String>AValue( HashMap<Integer,String>map){
	    for (Iterator it = map.values().iterator(); it.hasNext();) {
	        Object value = it.next();
	    }return map;
		}
}
	

