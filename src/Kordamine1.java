
public class Kordamine1 {

	public static void main(String[] args) {
		Kordamine1 kt = new Kordamine1();
		int[] testArray = { 7, 4, 1, 7, 7, 2, 5 };
		System.out.println(kt.getFirstTwo("peavalu"));
		System.out.println(kt.repeatFirstChar("moos", 3));
		System.out.println(kt.missingChar("listen", 3));
		System.out.println(kt.afterChar("mixmitte"));
		System.out.println(kt.countSeven(testArray));
		System.out.println(kt.countEven(testArray));
		System.out.println(kt.minElement(testArray));
		System.out.println(kt.getToABC("kocbar"));
		System.out.println(kt.changeFirstAndLast(testArray));

	}

	public String getFirstTwo(String str) {
		return str.substring(0, 2);
	}

	// Tagastada esimese t�he kordus etteantud kordi.
	// Nt repeatFirstChar(�abc�, 4) -> �aaaa"
	public String repeatFirstChar(String str, int n) {
		// char first = str.charAt(0);
		String first = str.substring(0, 1);
		String result = "";
		for (int i = 0; i < n; i++) {
			result += first;
		}
		return result;
	}

	public String missingChar(String str, int n) {
		String first = str.substring(0, n);
		String last = str.substring(n + 1, str.length());
		return first + last;
	}

	public String afterChar(String str) {
		int xIndex = str.indexOf("x");
		for (int i = 0; i < xIndex; i++) {
			if (str.length() > xIndex) {
				return str.substring(xIndex, str.length());
			}
		}
		return str.substring(0, str.length());

	}

	public int[] makePi() {
		int[] result = new int[0];
		for (int i = 0; i < 3; i++) {
			result[i] += result[i];
		}
		return result;

	}

	public int countSeven(int[] elements) {
		int count = 0;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == 7) {
				count += 1;
			}
		}
		return count;
	}

	public int countEven(int[] elements) {
		int count = 0;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] % 2 == 0) {
				count += 1;
			}
		}
		return count;
	}

	public int minElement(int[] elements) {
		int min = elements[0];
		for (int element : elements) {
			if (element < min) {
				min = element;
			}

		}
		return min;
	}

	public String getToABC(String str) {
		int aindex = str.indexOf("a");
		int bindex = str.indexOf("b");
		int cindex = str.indexOf("c");
		for (int i = 0; i < str.length(); i++) {
			if (str.length() > aindex) {
			return str.substring(0, aindex);}
			if(str.length() > bindex){
			return str.substring(0, bindex);}
}
		return str.substring(0, cindex);}
	public int[] changeFirstAndLast(int[] nums){
		int [] result = new int[nums.length];
		result[0]=nums[2];
		result[1]=nums[1];
		result[2]=nums[0];
		return result;
	}
	public String getAverageChars(String array ,Char){
}