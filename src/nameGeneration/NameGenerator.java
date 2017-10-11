package nameGeneration;

import java.util.Random;

public class NameGenerator {

	public static void main(String[] args) {
		NameGenerator nameGeneratorObject = new NameGenerator();
		System.out.println(nameGeneratorObject.getRandomFirstName(1));
		System.out.println(nameGeneratorObject.getRandomLastName());
		System.out.println(nameGeneratorObject.getRandomFullName() + "\n");
	}

	private String[] firstNames = { "Kati", "Mati", "Jaanus", "Peeter", "Mari" };
	String[] firstNamesF = { "Kati", "Mari", "Jaana", "Pille", "Mari" };
	String[] firstNamesM = { "Karl", "Mati", "Jaanus", "Peeter", "Martin" };
	private String[] lastNames = { "Tamm", "Kask", "Pilv", "Saar", "Oja", "Luts" };
	Random random = new Random();

	/*
	 * TODO Kui ülesanded on valmis, siis teha need ümbes selliselt, et oleks
	 * võimalik valida mehe ja naiste nimedele vahel.
	 */

	public String getRandomFirstName(int bool) {
//		int indexF = random.nextInt(firstNamesF.length - 1);
//		int indexM = random.nextInt(firstNamesM.length - 1);
//		if (sex.equals("F")) {
//			return firstNamesF[indexF] + " " + lastNames[random.nextInt(lastNames.length)];
//		} else if (sex.equals("M")) {
//			return firstNamesM[indexM] + " " + lastNames[random.nextInt(lastNames.length)];
//		} else {
//			return ("select sex");

//		}
		boolean b = bool%2 == 0;
		if (b) {
			return firstNamesF[random.nextInt(firstNamesF.length)];
		} else {
			return firstNamesM[random.nextInt(firstNamesM.length)];
		}
		
		
	}

	public String getRandomLastName() {
		return lastNames[random.nextInt(lastNames.length)];
	}

	public String getRandomFullName() {
		return firstNames[random.nextInt(firstNames.length)] + " " + lastNames[random.nextInt(lastNames.length)];
	}

	public String generateRandomName(int charNumber) {
//		String[] firstName =
		return "";
	}

	public Integer generateRandomNumberBetween(int beg, int end) {
		// TODO
		return 0;
	}

	public boolean flipPenny() {
		// 
		return true;
	}
}
