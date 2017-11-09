package nameGeneration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class NameGenerator {

	public static void main(String[] args) {
		// for (int i = 68; i < 88; i++) {
		// System.out.println((char) i); //http://www.theasciicode.com.ar/
		// }
		//
		NameGenerator nameGeneratorObject = new NameGenerator();
		// System.out.println(nameGeneratorObject.getRandomFirstName(true));
		// System.out.println(nameGeneratorObject.getRandomLastName());
//		System.out.println(nameGeneratorObject.getRandomFullName() + "\n");
		// System.out.println(nameGeneratorObject.generateRandomString(6));
		 System.out.println(nameGeneratorObject.generateRandomNumberBetween(10, 12));
		// System.out.println(nameGeneratorObject.flipPenny() + "\n");
		// System.out.println(nameGeneratorObject.generateRandomName(5));
		// System.out.println(nameGeneratorObject.personData());
		// System.out.println(nameGeneratorObject.randomNameFromArray(firstNames));
	}

	static String[] firstNames = { "Kati", "Mati", "Jaanus", "Peeter", "Mari" };
	String[] firstNamesF = { "Kati", "Mari", "Jaana", "Pille", "Mari" };
	String[] firstNamesM = { "Karl", "Mati", "Jaanus", "Peeter", "Martin" };
	private String[] lastNames = { "Tamm", "Kask", "Pilv", "Saar", "Oja", "Luts" };
	char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
			't', 'u', 'v', 'w', 'x', 'y', 'z' };
	int[] numbers = { 67, 4, 89, 2, 5, 1, 8, 42, 5, 90, 34, 88, 3 };
	String[] names = { "Maie", "Tiit", "Koit", "Aet", "Tiiu", "Ain" };

	Random random = new Random();

	/*
	 * TODO Kui ülesanded on valmis, siis teha need ümbes selliselt, et oleks
	 * võimalik valida mehe ja naiste nimedele vahel.
	 */

	private String randomNameFromArray(String[] array) {
		return array[random.nextInt(array.length)];
	}

	public String getRandomFirstName(boolean female) {
		// int indexF = random.nextInt(firstNamesF.length - 1);
		// int indexM = random.nextInt(firstNamesM.length - 1);
		// if (sex.equals("F")) {
		// return firstNamesF[indexF] + " " +
		// lastNames[random.nextInt(lastNames.length)];
		// } else if (sex.equals("M")) {
		// return firstNamesM[indexM] + " " +
		// lastNames[random.nextInt(lastNames.length)];
		// } else {
		// return ("select sex");

		// }
		/*
		 * boolean b = bool%2 == 0; if (b) { return
		 * firstNamesF[random.nextInt(firstNamesF.length)]; } else { return
		 * firstNamesM[random.nextInt(firstNamesM.length)]; }
		 */

		// if (female) {
		// return firstNamesF[random.nextInt(firstNamesF.length)];
		// } else {
		// return firstNamesM[random.nextInt(firstNamesM.length)];
		// }

		if (female) {
			return randomNameFromArray(firstNamesF);
		} else {
			return randomNameFromArray(firstNamesM);
		}

	}

	public String getRandomLastName() {
		return randomNameFromArray(lastNames);
	}

	public String getRandomFullName() {
		return getRandomFirstName(random.nextBoolean()) + " " + getRandomLastName();
	}

	public String generateRandomString(int charNumber) {
		String randomString = "";
		for (int i = 0; i < charNumber; i++) {

			randomString += String.valueOf((alphabet)[random.nextInt(alphabet.length)]);
		}
		return randomString;
	}

	public Integer generateRandomNumberBetween(int beg, int end) {
//		return beg + (int) (Math.random() * +end);
		return (int)(Math.random() * ((end-beg)+1)+ beg);
	}

	public boolean flipPenny() {

		// TODO Refactor
		if (Math.random() < 0.5) {
			return true;
		} else {
			return false;
		}
		// return random.nextBoolean(); -> 50/50 - true/false 
	}

	// Meetod, mis annab massiivi/listi inimeste nimedest. Parameetrina anda ette
	// inimeste hulk.
	public String generateRandomName(int nameNum) { // TODO
		// String[] names = new String[6];
		String randomName = "";
		for (int i = 0; i < nameNum; i++) {
			randomName += String.valueOf((names)[random.nextInt(nameNum)]);
		}
		return randomName;

	}

	public HashMap<String, Integer> personData(int personNum) {
		// String[] firstName = { "Aet", "Koit", "Tiiu", "Mait", "Maie", "Reet" };
		// int[] age = { 7, 16, 41, 75, 33, 55, 27 };
		// String[] surName = {"Toome", "Nei", "Urb", "Kass", "Kuusk", "Redis"};
		Random random = new Random();
		Map<String, String> names = new HashMap<String, String>();
		names.put("Aet", "aindex");
		names.put("Koit", "aindex");
		names.put("Tiiu", "aindex");
		names.put("Mait", "aindex");
		// int aindex = random.nextInt(age.length - 1);
		// int s = random.nextInt(surName.length - 1);
		return null;

		// return names.get(names + " " + age[aindex]);
	}
	// TODO koodi kordus random.nextInt(firstNamesF.length),
	// random.nextInt(firstNamesM.length)
	// TODO lastNames koondada kahest eelnevast massiivist
}