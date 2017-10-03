package year_1;

public class Warmup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warmup1 w = new Warmup1();
		System.out.println("Method sleepIn: " + w.sleepIn(true, true));
		System.out.println("Method frontBack: " + w.frontBack("mingi"));
		System.out.println("Method parrotTrouble: " + w.parrotTrouble(true, 7));
		System.out.println("Method notString: " + w.notString("x"));
		System.out.println("Method front22: " + w.front22("kitten"));
		System.out.println("Method sumDouble: " + w.sumDouble(3, 3));
		System.out.println("lol :D");
	}

	public boolean sleepIn(boolean weekday, boolean vacation) {
		/*
		 * boolean sleeping = !weekday || vacation; return sleeping;
		 */
		return !weekday || vacation;
	}// end of sleepIn

	// 1. Etteantud sõnast vahetada ära esimene ja viimane täht
	public String frontBack(String str) {
		if (str.length() < 2) {
			return str;
		}
		return lastLetter(str) + str.substring(1, str.length() - 1) + firstLetter(str);
		// samaväärne oleks teha ilma abimeetoditeta ehk
		// return str.substring(str.length()-1) + str.substring(1, str.length()
		// - 1) + str.substring(0, 1);
	}

	private String firstLetter(String string) {
		return string.substring(0, 1);
	}

	private String lastLetter(String string) {
		return string.substring(string.length() - 1);
	}

	public boolean parrotTrouble(boolean talking, int hour) {
		if (hour < 7 || hour > 20) {
			return true;
		} else {
			return false;

		}

	}

	public String notString(String str) {
		if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
			return str;
		}
		return "not " + str;
	}

	public String front22(String str) {
		String front = str.substring(0, 2);
		if (str.length() <= 2) {
			front = str.substring(0, 2);
		} else {
		}
		return front + str + front;

	}

	public int sumDouble(int a, int b) {
		int sum = a + b;
		if (a == b) {
			sum = sum * 2;
		}
		return sum;
	}

	public String front3(String str) {
		String  front;
if(str.length()>=3) { 
	return 
}
}
