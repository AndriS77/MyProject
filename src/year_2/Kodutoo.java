package year_2;
import java.util.*;
public class Kodutoo {

	public static void main(String[] args) {
		Kodutoo kodutooObject = new Kodutoo ();
        String[] names = {"Maie","Tiit","Koit", "Aet", "Tiiu","Ain"};

System.out.println("Hinne on: " + kodutooObject.valueGrade(3));
System.out.println("Nimed on: " + kodutooObject.getRandomName(3));

	}
	private String valueGrade(int num) {
		switch (num) {
		case 1:
			return "Kukkusid l�bi";
		case 2:
			return "Kukkusid l�bi veidi v�hem";
		case 3:
			return "Rahuldav";
		case 4:
			return "Hea";
		case 5:
			return "Suurep�rane";		
		default:
			throw new IllegalArgumentException("Hindamine toimub 5-palli s�stemis");
		}
	}
	//Meetod, mis annab massiivi/listi inimeste nimedest. Parameetrina anda ette inimeste hulk.
	private String[] getRandomName(int nameNum){
		String[] names = new String[nameNum]; 
		for (int i = 0; i < nameNum; i++) {
			String item =names[i];
		}
			return names;
		
		
	}
}
