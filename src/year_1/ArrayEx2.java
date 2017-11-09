package year_1;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		ArrayEx2 ae = new ArrayEx2();
		int[] testArray = { 6, 2, 3, 4, 6 };
		int[] testArray1 = { 5, 1, 3, 4, 8 };
		String[] testArray2 = { "hot", "five", "on", "horror" };
		System.out.println(ae.firstLast6(testArray));
		System.out.println(ae.commonEnd(testArray, testArray1));
		System.out.println(Arrays.toString(ae.reverse3(new int[] { 6, 4, 8, 11, 56 })));
		System.out.println(ae.minElements(testArray));
		System.out.println(ae.findLongestString(testArray2));
		System.out.println(Arrays.toString(ae.swapEnds(testArray1)));
		System.out.println(Arrays.toString(ae.rotateLeft3(testArray1)));
		System.out.println(ae.unlucky1(testArray1));
		System.out.println(ae.countEvens(testArray1));
	}

	private static char[] ArraysToString(int[] reverse3) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean firstLast6(int[] nums) {
		if (nums[0] == 6 || nums[nums.length - 1] == 6) {
			return true;
		} else {
			return false;
		}
	}

	// 2. Antud on kaks massiivi (a ja b nimelised), tagastada tõeväärtus true,
	// kui neil on mõlemal samad esimesed või viimased elemendid. Mõlema
	// eeldatav
	// pikkus on üks või rohkem elementi.
	public boolean commonEnd(int[] a, int[] b) {
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * 3. Antud on kolme elemendiga massiiv, tagastada uus massiiv, kus
	 * elemendid on vastupidises järjekorras. Nt {1, 2, 3} annab tulemuseks {3,
	 * 2, 1}.
	 */
	public int[] reverse3(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			result[i] = nums[nums.length - 1 - i];
		}
		return result;
	}

	// 3.Väikseima arvu leidmine täisarvulisest massiivist.
	public int minElements(int[] elements) {
		int min = elements[0];
		for (int element : elements) {
			if (element < min) {
				min = element;

			}

		}
		return min;
	}

	// 4. Pikima sõna leidmine sõnu hoidvast massiivist.
	public String findLongestString(String[] Strings) {
		int result = 0;
		String longest = Strings[0];
		for (int i = 0; i < Strings.length; i++) {
			if (Strings[i].length() > longest.length()) {
				longest = Strings[i];
				result = i;
			}

		}
		return Strings[result];
	}

	public int[] swapEnds(int[] nums) {
		int f = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = f;
		return nums;
	}

	public int[] rotateLeft3(int[] nums) {
		return new int[] { nums[1], nums[2], nums[0] };
	}

	public boolean unlucky1(int[] nums) {
		if (nums.length >= 2) {
			if ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3)
					|| (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3)) {
				return true;
			}
			return false;
		} else {
			return false;

		}
	}

	public int countEvens(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++)
			if (nums[i] % 2 == 0)
				count++;
		return count;
	}
}