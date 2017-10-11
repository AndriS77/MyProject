package year_2;
 import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HelloWorld {

	public static void main(String[] args) {
		HelloWorld helloWorldObject = new HelloWorld();
		System.out.println("helloWorld()result: " + helloWorldObject.sayHello("David") + "\n");
		System.out.println("test");
		System.out.println(helloWorldObject.generateHtmlElement("h1", "Suur pealkiri") + "\n");
		double[] temperature = { 4, 7, 9, 5, 9 };

		System.out.println("keskmine temperatuur: " + helloWorldObject.averageTemp(temperature));
		System.out.println("massivi otsitav number: " + helloWorldObject.intToWord (4)+ "\n" );
		System.out.println("suvaline nimi:" + helloWorldObject.randomName("F") + "\n");
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

	// Ülesanne: tervita kasutajat, tervitusteksti saad ise valida. Kasutajale nime
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
	 * Meetod, mis võtab sisendiks massiivi, tagastab arvulise väärtuse. Ülesanne:
	 * etteantud nädala temperatuurid, avutada keskmine temperatuur sel nädalal.
	 */
	private double averageTemp(double[] temp) {
		double sum = 0;
		for (int i = 0; i < temp.length; i++) {
			sum = sum + temp[i];
		}

		return sum / temp.length;
	}
	//Meetod, mis võtab sisendiks numbri (0-10). Väljundiks selle numbri sõnaline tähenduse. nt meetodiNimi(2) -> “kaks”
	
	
	private String intToWord(int number ) {
//		// kolmas variant
//		Map<Integer, String> numbers = new HashMap<Integer, String>();
//		numbers.put(0,"null");
//		numbers.put(1,"üks");
//		numbers.put(2,"kaks");
//		numbers.put(3,"kolm");
//		numbers.put(4,"neli");
//		numbers.put(5, "viis");
//		numbers.put(6, "kuus");
//		numbers.put(7, "seitse");
//		numbers.put(8, "kaheksa");
//		numbers.put(9, "üheksa");
//		
//		return numbers.get(number) ;
//		
		//teine variant
			switch (number) {
		case 0:
			return "null";
		case 1:
			return "üks";
		case 2:
			return "kaks";
		case 3:
			return "kolm";
		case 4:
			return "yksteist";
		case 5:
			return "viis";
		case 6:
			return "kuus";
		case 7:
			return "seitse";
		case 8:
			return "kaheksa";
		case 9:
			return "üheksa";
		default:
			throw new IllegalArgumentException("Number should be in range 0 to 9 ");
		}
//		if (number < 0 || number > 9 ) { 
//			throw new IllegalArgumentException("Number should be in range 0 to 9 ");
//			//Erind
//		}
		//esimene variant
//	String[] numberStrings = { "null", "üks", "kaks", "kolm", "neli", "viis", "kuus", "seitse", "kaheksa", "üheksa", "kümme"};
//		return numbers[number];
			
	}
	 public String randomName(String sex) {
	        Random random = new Random();
	        String[] firstNameF = {"Maie", "Aet", "Tiiu"};
	        String[] firstNameM = {"Koit","Ivo","Mait"};
	        String[] surName = {"Toome", "Nei", "Urb", "Kass", "Kuusk", "Redis"};
	        int firsta = random.nextInt(firstNameF.length - 1);
	        int firstb = random.nextInt(firstNameM.length - 1);
	        int surindex = random.nextInt(surName.length - 1);
//	        return firstName[firstindex] + " " + surName[surindex];
	        if (sex.equals("F")) {
	            return firstNameF[firsta] + " " + surName[surindex];
	        } else if (sex.equals("F")) { 
	            return firstNameF[firsta] + " " + surName[surindex];
	        } else if (sex.equals("F")) {
	            return firstNameF[firsta] + " " + surName[surindex];
	        } else if (sex.equals("M")){
	            return firstNameM[firstb] + " " + surName[surindex];
	        } else if (sex.equals("M")){
	            return firstNameM[firstb] + " " + surName[surindex];
	        } else if (sex.equals("M")){
	            return firstNameM[firstb] + " " + surName[surindex];
	        } else {
	            return "Select sex!";
	        }
}}