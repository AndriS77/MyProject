
public class CorrectSentence {

	public static void main(String[] args) {
		// Demo
		/*
		int a = 5;
		int b = 2;
		
		//AND "ja" &&
		boolean biggerThan4 = a > 4 && b > 4;
		System.out.println("M�lemad suuremad kui 4 : " + biggerThan4 + " (a > 4 " + (a > 4) + " b > 4 " + (b > 4) + ")");
		
		//OR "v�i" ||
		boolean oneBiggerThan4 = a > 4 || b > 4;
		System.out.println("V�hemalt �ks on suurem kui 4 : " + oneBiggerThan4 + " (a > 4 " + (a > 4) + " b > 4 " + (b > 4) + ")");
		
		//NOT "ei" !  eitav v�rdlus !=
		boolean aNotSmallerThan10 = !(a < 10);
		System.out.println("a ei ole v�iksem kui 10 : " + aNotSmallerThan10);
		
		boolean aNotEquals4 = a != 4;
		System.out.println("a ei ole v�rdne 4-ga: " + aNotEquals4);
		*/
		CorrectSentence cs= new CorrectSentence();
		String str1 = "Maja On ilUs";
		String str1Upper = str1.toUpperCase();
//		System.out.println(str1Upper);
		
		String str1Lower = str1.toLowerCase();
//		System.out.println(str1Lower);
//        System.out.println(cs.toUpperFirstChar(str1));
//        System.out.println(cs.addMark(str1, "punkt" ));
		System.out.println(cs.sentenceToLower(str1));
	}
	
	public String correctSentence(String sentence) {
		//TODO your code
		return "";
	}
	
//	Abimeetodid
//	1. eemaldada suured t�hed s�nade keskelt.
//	2. lisada suur algust�ht
//	3. lisada lausel�pu m�rk.
	
	//nt toUpperFirstChar("kaunis ilm") -> "Kaunis ilm" 
	private String toUpperFirstChar(String sentence) { //sentence = "kaunis ilm"
		String firstChar = sentence.substring(0, 1); // "k"
		String firstCharUpper = firstChar.toUpperCase();  //"K"
		String allTheRest = sentence.substring(1) ; // "aunis ilm"
		return firstCharUpper + allTheRest; // Liita suur algus t�ht "K" + "aunis ilm" = "Kaunis ilm"
	}
	
	//nt addMark("Ilm on ilus", ".") -> "Ilm on ilus."
	//nt addMark("Maja on ka ilus", "!") -> "Maja on ka ilus!"
	public String addMark(String sentence, String mark){
		if (mark != "." || mark != "!" || mark != "?") {//kui ei ole . V�I kui ei ole ! V�I kui ei ole ?
			throw new IllegalArgumentException("Mark must be . or ! or ? Invalid mark was: " + mark);
		}
		return sentence + mark;
	}
	
	//eemaldada suured t�hed s�nade keskelt.
	// sentenceToLower("ILm oN ilus") -> "Ilm on ilus"
	private String sentenceToLower (String sentence) {
		return sentence.substring(0, 1) + sentence.substring(1).toLowerCase();
	}

}

