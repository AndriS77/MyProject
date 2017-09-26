import java.util.*;

public class Palindroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindroom palindrom = new Palindroom();

		List<String> listOne = Arrays.asList("kook", "eiolepalindroom", "kuulilennuteetunneliluuk", "tore");

		System.out.println("Algne list on: " + listOne);
		System.out.println("Tagurpidi sõna: " + palindrom.reverseString(listOne.get(1))); // "moordnilapeloie"
		System.out.println("Kas on palindrom? :" + palindrom.isPalindrom(listOne.get(0))); // true

		System.out.println("List palindroomidest on: " + palindrom.sortOutPalindroms(listOne));
		// listOne puhul peaks vastusek tulema ["kook",
		// "kuulilennuteetunneliluuk"]

	}

	/**
	 * Meetod, mis tagastab tagurpidise sõna.
	 * 
	 * @param str
	 * @return tagurpidise sõna 'str' parameetrist
	 */
	private String reverseString(String str) {
		String reversed = "";
		for (int i = 0; i < str.length(); i++) {
			reversed = str.charAt(i) + reversed;
		}
		return reversed;
	}

	/**
	 * Meetod palindroomi kindlakstegemiseks (kasutada tuleb eelnevat meetodit
	 * reverseString)
	 * 
	 * @param str
	 * @return return tõeväärtuse true, kui tegemist on palindroomiga
	 */
	private boolean isPalindrom(String str) {
		
		return false;

	}

	/**
	 * Meetod, mis tagastab uue list sõnadest, mis on palindroomid (tuleb
	 * kasutada eelnevat meetodit "isPalindrom")
	 * 
	 * @param listOfStrings
	 * @return list palindroomidest etteantud listi põhjal
	 */
	private List<String> sortOutPalindroms(List<String> listOfStrings) {

		// Your code
		return listOfStrings;
	}

}
