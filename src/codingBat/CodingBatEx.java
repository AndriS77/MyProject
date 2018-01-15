package codingBat;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CodingBatEx {

	public static void main(String[] args) {
		CodingBatEx cbe = new CodingBatEx();

		int[] intArray = { 7, 6, 45, 99, 13, 7, 6 };
		List<Integer> listInts = new ArrayList<>();
		listInts.add(73);
		listInts.add(19);
		listInts.add(26);

		List<String> listStrings = new ArrayList<>();
		listStrings.add("öö");
		listStrings.add("tahvel");
		listStrings.add("ahv");
		listStrings.add("uks");
		listStrings.add("ahvena");
		
		Map<String, String> mingiMap = new HashMap<>();
		mingiMap.put("a", "cake");

		String[] stringArray = { "öö", "tahvel", "ahv", "uks", "ahvenad" };

		System.out.println("Massiivi pikkus " + intArray.length);
		System.out.println(Arrays.toString(cbe.subArray(intArray, 0, 3)));
		// massiivi lisamine
		intArray[0] = 17;
		System.out.println(Arrays.toString(intArray));

		// elemendi väärtuse saaamine
		System.out.println("Esimene element masiivis " + intArray[0]);
		System.out.println("Esimene element listis " + listInts.get(0));
		// sublist
		System.out.println("Sublisti elemendid " + listInts.subList(0, 2));
		listInts.subList(0, 2).clear();
		System.out.println("List peale eemaldamist " + listInts);
		System.out.println(cbe.sameEnds(intArray, 3));
		System.out.println("Listi Pikkus " + listInts.size());
		System.out.println("countA " + cbe.countA(stringArray));
		System.out.println("Väiksem kui viis " + cbe.getLessThan5(listInts));
		System.out.println("Pikim sõna on " + cbe.getLongestString(stringArray));
		System.out.println("Pikim sõna listis " + cbe.getLongestStringV2(listStrings));
		System.out.println("Massiivis on viis: " + cbe.arrayHas5(intArray));
		System.out.println("Listis on viis: " + cbe.listHas5(listInts));
		System.out.println("Massiivis on sõna, mis algab " + cbe.startsWithGivenLetter(stringArray, 'a' ));
		System.out.println("b varastab a " + cbe.mapBully(mingiMap));    
	}

	private String mapBully(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean sameEnds(int[] nums, int len) {
		/*
		 * int[] beg = subArray(nums, 0, len); int[] end = subArray(nums, nums.length -
		 * len, nums.length); System.out.println("Algus  " + Arrays.toString(beg) );
		 * System.out.println("Lõpp " + Arrays.toString(end));
		 * 
		 * return Arrays.equals(beg, end);
		 */
		for (int i = 0; i < len; i++) {
			System.out.println("Algus " + nums[i]);
			System.out.println("Lõpust " + nums[nums.length - len + i]);
			if (nums[i] != nums[nums.length - len + i]) {
				return false;

			}

		}
		return true;

	}

	private int[] subArray(int[] array, int beg, int end) {

		int[] result = new int[end - beg];
		int index = 0;
		for (int i = beg; i < end; i++) {
			result[index] = array[i];
			index++;
		}
		return result;
	}

	// Etteantud massiivist loetleda kokku mitu sõna algab “a” tähega.
	public int countA(String[] strings) {
		/*
		 * int count = 0; for (String str : strings) { if(str.substring(0,
		 * 1).equals("a")) { count++; }
		 * 
		 * } return count;
		 */
		// versioon 2
		int count = 0;
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].startsWith("a")) {
				count++;
			}

		}
		return count;
	}

	// Listist, esialgset listi muutmata, võtta välja kõik 5 väiksemad arvud ning
	// tagastada list (või massiiv) nendest.
	// getLessThan5 [1, 5, 4, 7] => [1,4]
	public List<Integer> getLessThan5(List<Integer> list) {

		List<Integer> result = new ArrayList<Integer>();

		for (Integer item : list) {
			if (item < 5) {
				result.add(item);
			}
		}
		return result;
	}

	// Leida etteantud massiivi pikim sõna.
	public String getLongestString(String[] str) {

		String result = str[0];

		for (String item : str) {
			if (item.length() > result.length()) {
				result = item;
			}
		}
		return result;
	}

	public String getLongestStringV2(List<String> strings) {

		String result = "";

		for (String item : strings) {
			if (item.length() > result.length()) {
				result = item;
			}
		}
		return result;
	}

	// Tagastada tõeväärtus (boolean – true/false), kas massiivis on nr 5.

	public boolean arrayHas5(int[] ints) {

		for (int element : ints) {
			if (element == 5) {
				return true;
			}
		}
		return false;
	}

	public boolean listHas5(List<Integer> ints) {
		for (int element : ints) {
			if (element == 5) {
				return true;
			}
		}
		return false;
	}

	//Tagastada tõeväärtus (boolean – true/false), kas massiivis on mõni parameetriga etteantud tähega algav sõna.
 	
	public boolean startsWithGivenLetter(String[] str, char chr) {
		
		for (int i = 0; i < str.length; i++) {
			String word = str[i];
			if (word.substring(0, 1).equals(chr)) {
				return true;
			}
		}
		return false;
	}
	
	public Map<String, String> mapBully(Map<String, String> map) {
		  if (map.containsKey("a")) {
		  map.put("b", map.get("a"));
		  map.put("a", "");
		  }
		  return map;
		}

		  
	}

