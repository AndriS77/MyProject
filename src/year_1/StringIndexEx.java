package year_1;

public class StringIndexEx {

	public static void main(String[] args) {
		System.out.println(charToX("gamebox"));
		// System.out.println("suhtlex");
		System.out.println();
		System.out.println(startsWith("Andri tantsib vihmas", "Andri"));
		System.out.println(startsWith("Liivar tantsib vihmas", "Andri"));
	}

	public static String charToX(String str) {
		int aIndex = str.indexOf('e');
		int bIndex = str.indexOf('x');
		return str.substring(aIndex, bIndex);
	}

	/*
	 * public static String toX(String str){ String result = ""; for (int i = 0;
	 * i < str.charAt("x"); i++) { System.out.println(); } return result; }
	 */
	public static String startsWith(String str, String name) {
		if (str.startsWith(name)) {
			return name;
		} else {
			return "Ei alga sobiva sõnaga";
		}
	}
}