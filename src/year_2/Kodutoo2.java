package year_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Kodutoo2 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> persons = new HashMap<>();
		persons.put(2, "Indrek");
		persons.put(17, "Kalmer");
		persons.put(3, "Mati");
		
		lowestKeyValue(persons,7);
      //  Entry<Integer, String> entry = persons.ceilingEntry();
		//System.out.println(persons.firstKey());
		
		}
	
		public static Map<Integer,String> lowestKeyValue(Map<Integer,String> map, int key){
			List<Integer> keys = new ArrayList<>();
			map.forEach((k,v)->{
				keys.add(k);});
			int lowest = Collections.min(keys);
			map.put(key,map.get(lowest));
			map.remove(lowest);
			return map;
			}
		}
	

