package mapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		Map<Integer, String> people = new HashMap<Integer, String>();
		people.put(1, "Veronica");
		people.put(2, "Miia");
		people.put(3, "Lumi-Ly");
	//	System.out.println(people.get(2));
		for (Integer key : people.keySet()) {
			System.out.println(key + " " + people.get(key));
		}*/ 
		
	// Uue mapi loomine 
		MapDemo md = new MapDemo();
		
		Map<Integer, String> demoMap = new HashMap<Integer, String>();
		
		md.myMethod(demoMap); 
		
		// Mapi uue vıti-v‰‰rtuspaari lisamine.
		demoMap.put(1, "Valdur");
		demoMap.put(2, "Kalmer");
		demoMap.put(1, "Indrek");
		demoMap.put(3, "Indrek");
		
		System.out.println(demoMap);
		
		//V‰‰rtuse v‰lja k¸simine.
		System.out.println(demoMap.get(3));
		
		//Paari emaldamine
		demoMap.remove(2);
		System.out.println(demoMap); 
		//Kontroll, kas vastava vıtmega paar on olemas
		System.out.println(demoMap.containsKey(1 ));
		System.out.println("______________________");
		//Mapi l‰bimine
		for (Map.Entry<Integer, String> entry : demoMap.entrySet()) {
		System.out.println("Vˆti: " + entry.getKey() + " v‰‰rtus" + entry.getValue());
	}
		System.out.println("______________________");
		//Mapi kıik vıtmed
		System.out.println(demoMap.keySet());
		for (Integer  key : demoMap.keySet()) {
			System.out.println(key);
		}
		System.out.println("______________________");
		//Mapi kıik v‰‰rtused
		System.out.println("Mapi kıik v‰‰rtused: " + demoMap.values());  
		}
	 
	
	
	public String myMethod(Map<Integer, String> map ) {
		return map.get(1);
	}
}
