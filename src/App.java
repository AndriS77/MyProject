import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		App appObject = new App();
		System.out.println("helloWorld()result: " + appObject.sayHello("David") + "\n");
		System.out.println("test");
		System.out.println(appObject.generateHtmlElement("h1", "Suur pealkiri") + "\n");
		double[] temperature = { 4, 7, 9, 5, 9 };
		//String Array1[] = { "null", "üks", "kaks", "kolm", "neli", "viis", "kuus", "seitse", "kaheksa", "üheksa",
			//	"kümme" };
		System.out.println("keskmine temperatuur: " + appObject.averageTemp(temperature));
		System.out.println("massivi otsitav number: " + appObject.numberList(2) + "\n");
		int[] arrayInts = { 2, 3, 4 };
		System.out.println(Arrays.toString(arrayInts));
		int firstNum = arrayInts[0];
		System.out.println("esimene väärtus on: " + firstNum);
		arrayInts[0] = 7;
		System.out.println("muutunud massiv on: " + Arrays.toString(arrayInts));

		int[] arrayInts2 = new int[5];
		arrayInts2[1] = 37;
		System.out.println("Uus massiiv: " + Arrays.toString(arrayInts2));

		// LOOP version 1
		for (int i = 0; i < arrayInts.length; i++) {
			int item = arrayInts[i];
			System.out.println(item);

		}
		System.out.println();

		// LOOP variant 2
		for (int i : arrayInts2) {
			System.out.println(i);
		}
	}

	// Ülesanne: tervita kasutajat, tervitusteksti saad ise valida. Kasutajale
	// nime
	// saad parameetrina
	private String sayHello(String name) {

		return "Hello " + name;
	}

	/*
	 * antakse ette HTMLi element ja tagi nimetus-mõlemad võivad olla sõnelised
	 * väärtused. Väljastatakse HTML teksti kujul. (nt generateHtmlElement(“h1”,
	 * “Suur pealkiri”) -> “<h1>Suur pealkiri</h1>”
	 */
	private String generateHtmlElement(String tag, String value) {
		String firstTag = "<" + tag + ">";
		String lastTag = "</" + tag + ">";
		return firstTag + value + lastTag;
		// StringBuilder htmlElement = new StringBuilder("<");
		// return
		// htmlElement.append(tag).append(">").append(value).append("</").append(tag).append(">").toString;
	}

	/*
	 * Meetod, mis võtab sisendiks massiivi, tagastab arvulise väärtuse.
	 * Ülesanne: etteantud nädala temperatuurid, avutada keskmine temperatuur
	 * sel nädalal.
	 */
	private double averageTemp(double[] temp) {
		double sum = 0;
		for (int i = 0; i < temp.length; i++) {
			sum = sum + temp[i];
		}

		return sum / temp.length;
	}
	// Meetod, mis võtab sisendiks numbri (0-10). Väljundiks selle numbri
	// sõnaline tähenduse. nt meetodiNimi(2) -> “kaks”

	private String numberList(int number) {
		String numbers[] = { "null", "üks", "kaks", "kolm", "neli", "viis", "kuus", "seitse", "kaheksa", "üheksa",
		"kümme" };


		return numbers[number];
		// System.out.println("sayHello() result: " +
		// appObject.sayHello("David") + "\n");

		// System.out.println("generateHtmlElement() result: " +
		// appObject.generateHtmlElement("h4", "Väiksem pealkiri"));
	}

	// generateHtmlElement(“h1”, “This is a Heading”) -> “<h1>This is a
	// Heading</h1>”
	/*private String generateHtmlElement(String tag, String value) {
		// 1. variant
		// return "<" + tag + ">" + value + "</" + tag + ">";

		// 2. variant
		// String htmlElement = String.format("<%1$s>%2$s</%1$s>", tag, value);

		// 3.variant
		StringBuilder htmlElement = new StringBuilder("<");

		return htmlElement.append(tag).append(">").append(value).append("</").append(tag).append(">").toString();

	}

	// int number numbers
	private String intToWorld(int number) {
		switch (number) {
		case 0:
			return "null";
		case 1:
			return "üks";
		default:
			throw new IllegalArgumentException("Number peaks olema vahemikus 0 kuni 9");
		}
	}
	// Etteantud nädala(või muu periood) temperatuurid, avutada keskmine
	// temperatuur sel nädalal.*/

}