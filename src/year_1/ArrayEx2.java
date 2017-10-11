 package year_1;
import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		ArrayEx2 ae = new ArrayEx2();
		int[] testArray = { 6, 2, 3, 4, 6 };
		int[] testArray1 = { 9, 4, 8, 7 };
		String[] testArray2 = {"hot","five","on","horror"};
		System.out.println(ae.firstLast6(testArray));
		System.out.println(ae.commonEnd(testArray, testArray1));
		System.out.println(Arrays.toString(ae.reverse3(new int[] { 6, 4, 8, 11, 56 })));
		System.out.println(ae.minElements(testArray));
		System.out.println(ae.findLongestString(testArray2));
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
	//4. Pikima sõna leidmine sõnu hoidvast massiivist.
	public String findLongestString(String[] Strings){
		int result=0;
		String longest = Strings[0];
		for (int i = 0; i < Strings.length; i++) {
			if(Strings[i].length()>longest.length())
		  {
				longest=Strings[i];
				result=i;
		  }
			
		}
		return Strings[result];
	}
}
