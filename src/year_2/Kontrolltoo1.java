package year_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kontrolltoo1 {

	public static void main(String[] args) {
		Kontrolltoo1 kt = new Kontrolltoo1();

		String[] stringArray = { "banaan", "ahven", "buss", "bokser", "auk", "professor" };
		int[] intArray = { 7, 45, 8, 13, 4, 6 };
		List<Integer> listInts = new ArrayList<>();
		listInts.add(8);
		listInts.add(6);
		listInts.add(4);
		listInts.add(5);
		listInts.add(11);
		listInts.add(17);

		System.out.println("b-ga algavad sõnad massivis: " + kt.countB(stringArray));
		System.out.println("List paaritutest arvudest: " + kt.getOddNumbers(listInts));
		System.out.println("pikim sõna massivis: " + kt.longestWord(stringArray));
		System.out.println("kas massivis on paarisarv: " + kt.ifEvenNumbers(intArray));
		System.out.println("esimene ja viimane sõna vahetatult: " + Arrays.toString(kt.swapFirstLast(stringArray)));
	}

	// Ül 1
	public int countB(String[] string) {
		int count = 0;
		for (String str : string) {
			if (str.substring(0, 1).equals("b")) {
				count++;
			}
		}
		return count;

	}

	// Ül 2
	public List<Integer> getOddNumbers(List<Integer> list) {
		List<Integer> result = new ArrayList<Integer>();
		for (Integer item : list) {
			if (item % 2 != 0) {
				result.add(item);
			}
		}
		return result;

	}

	// Ül3
	public String longestWord(String[] str) {
		String result = "";
		for (String item : str) {
			if (item.length() > result.length()) {
				result = item;
			}
		}
		return result;

	}

	// Ül 4
	public boolean ifEvenNumbers(int[] ints) {
		for (int element : ints) {
			if (element % 2 == 0) {
				return true;
			}
		}
		return false;
	}

	// ül 5
	public String[] swapFirstLast(String[] string) {
		String first = string[0];
		string[0] = string[string.length - 1];
		string[string.length - 1] = first;
		return string;
	}

}
