package year_2;
 import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HelloWorld {

	public static void main(String[] args) {
		HelloWorld helloWorldObject = new HelloWorld();
		System.out.println("helloWorld()result: " + helloWorldObject.sayHello("David") + "\n");
		System.out.println("test");
		System.out.println(helloWorldObject.generateHtmlElement("h1", "Suur pealkiri") + "\n");
		double[] temperature = { 4, 7, 9, 5, 9 };

		System.out.println("keskmine temperatuur: " + helloWorldObject.averageTemp(temperature));
		System.out.println("massivi otsitav number: " + helloWorldObject.intToWord (2)+ "\n" );
		int[] arrayInts = { 2, 3, 4 };
		System.out.println(Arrays.toString(arrayInts));
		int firstNum = arrayInts[0];
		System.out.println("esimene v��rtus on: " + firstNum);
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

	// �lesanne: tervita kasutajat, tervitusteksti saad ise valida. Kasutajale nime
	// saad parameetrina
	private String sayHello(String name) {

		return "Hello " + name;
	}

	/*
	 * antakse ette HTMLi element ja tagi nimetus-m�lemad v�ivad olla s�nelised
	 * v��rtused. V�ljastatakse HTML teksti kujul. (nt generateHtmlElement(�h1�,
	 * �Suur pealkiri�) -> �<h1>Suur pealkiri</h1>�
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
	 * Meetod, mis v�tab sisendiks massiivi, tagastab arvulise v��rtuse. �lesanne:
	 * etteantud n�dala temperatuurid, avutada keskmine temperatuur sel n�dalal.
	 */
	private double averageTemp(double[] temp) {
		double sum = 0;
		for (int i = 0; i < temp.length; i++) {
			sum = sum + temp[i];
		}

		return sum / temp.length;
	}
	//Meetod, mis v�tab sisendiks numbri (0-10). V�ljundiks selle numbri s�naline t�henduse. nt meetodiNimi(2) -> �kaks�
	
	
	private String intToWord(int number ) {
		String[] numbers = { "null", "�ks", "kaks", "kolm", "neli", "viis", "kuus", "seitse", "kaheksa", "�heksa", "k�mme"};
		Map<Integer, String> numbers = new HashMap<Integer, String()>;
		numbers.put(0,"null");
		numbers.put(1,"");
		numbers.put(2,"kaks");
		numbers.put(3,"kolm");
		numbers.put(4,"");
		
		
		/*	switch (number) {
		case 0:
			return "null";
		case 1:
			return "�ks";
		case 2:
			return "kaks";
		default:
			throw new IllegalArgumentException("Number should be in range 0 to 9 ");
		}*/
		if (number < 0 || number > 9 ) { 
			throw new IllegalArgumentException("Number should be in range 0 to 9 ");
			//Erind
		}
		return numbers[number];
	}
}