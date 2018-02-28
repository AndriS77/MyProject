package Headphone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class App {

	public static void main(String[] args) {
		   ArrayList<String> obj = new ArrayList<String>();

		Headphone korvaKlapid1 = new Headphone("Bludio", 50, false);
		System.out.println(korvaKlapid1);
		System.out.println("Kas on kallis: " + korvaKlapid1.isExpensiveString());
		System.out.println(korvaKlapid1.isExpensive() ? "Kõrvaklapid on kallid" : "Kõrvaklapid on odavad");
		
		Headphone korvaKlapid2 = new Headphone("Samsung");
		korvaKlapid2.setPrice(154.50);
		System.out.println(korvaKlapid2);
		
		Student student1 = new Student("Tom", "Saar", new ArrayList<>(Arrays.asList("Keemia","Matemaatika")));
		System.out.println(student1);
		
		Student student2 = new Student("Tom", "Saar", new GregorianCalendar(2013,1,28), Type.ESMAKURSULANE);
		System.out.println(student2);
		
		
		
		List<String>specs=new ArrayList(Arrays.asList("mikrofon","mürasummutaja"));
		Headphone korvaklapid3 =new Headphone("Sony", 180, false, specs);
		korvaklapid3.addSpecification("NFC");
		System.out.println(korvaklapid3);
	}
}
