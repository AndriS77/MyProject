package year_1;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		App appObject = new App();
		System.out.println("helloWorld()result: " + appObject.sayHello("David") + "\n");
		System.out.println("test");
		System.out.println(appObject.generateHtmlElement("h1", "Suur pealkiri") + "\n");
		double[] temperature = { 4, 7, 9, 5, 9 };
		//String Array1[] = { "null", "Ã¼ks", "kaks", "kolm", "neli", "viis", "kuus", "seitse", "kaheksa", "Ã¼heksa",
			//	"kÃ¼mme" };
		System.out.println("keskmine temperatuur: " + appObject.averageTemp(temperature));
		System.out.println("massivi otsitav number: " + appObject.numberList(2) + "\n");
		int[] arrayInts = { 2, 3, 4 };
		System.out.println(Arrays.toString(arrayInts));
		int firstNum = arrayInts[0];
		System.out.println("esimene vÃ¤Ã¤rtus on: " + firstNum);
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

	// Ãœlesanne: tervita kasutajat, tervitusteksti saad ise valida. Kasutajale
	// nime
	// saad parameetrina
	private String sayHello(String name) {

		return "Hello " + name;
	}

	/*
	 * antakse ette HTMLi element ja tagi nimetus-mÃµlemad vÃµivad olla sÃµnelised
	 * vÃ¤Ã¤rtused. VÃ¤ljastatakse HTML teksti kujul. (nt generateHtmlElement(â€œh1â€�,
	 * â€œSuur pealkiriâ€�) -> â€œ<h1>Suur pealkiri</h1>â€�
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
	 * Meetod, mis vÃµtab sisendiks massiivi, tagastab arvulise vÃ¤Ã¤rtuse.
	 * Ãœlesanne: etteantud nÃ¤dala temperatuurid, avutada keskmine temperatuur
	 * sel nÃ¤dalal.
	 */
	private double averageTemp(double[] temp) {
		double sum = 0;
		for (int i = 0; i < temp.length; i++) {
			sum = sum + temp[i];
		}

		return sum / temp.length;
	}
	// Meetod, mis vÃµtab sisendiks numbri (0-10). VÃ¤ljundiks selle numbri
	// sÃµnaline tÃ¤henduse. nt meetodiNimi(2) -> â€œkaksâ€�

	private String numberList(int number) {
		String numbers[] = { "null", "Ã¼ks", "kaks", "kolm", "neli", "viis", "kuus", "seitse", "kaheksa", "Ã¼heksa",
		"kÃ¼mme" };


		return numbers[number];
		// System.out.println("sayHello() result: " +
		// appObject.sayHello("David") + "\n");

		// System.out.println("generateHtmlElement() result: " +
		// appObject.generateHtmlElement("h4", "VÃ¤iksem pealkiri"));
	}

	// generateHtmlElement(â€œh1â€�, â€œThis is a Headingâ€�) -> â€œ<h1>This is a
	// Heading</h1>â€�
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
			return "Ã¼ks";
		default:
			throw new IllegalArgumentException("Number peaks olema vahemikus 0 kuni 9");
		}
	}
	// Etteantud nÃ¤dala(vÃµi muu periood) temperatuurid, avutada keskmine
	// temperatuur sel nÃ¤dalal.*/

}
