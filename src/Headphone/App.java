package Headphone;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class App {

	public static void main(String[] args) {
		/*   ArrayList<String> obj = new ArrayList<String>();

		Headphone korvaKlapid1 = new Headphone("Bludio", 50, false);
		System.out.println(korvaKlapid1);
		System.out.println("Kas on kallis: " + korvaKlapid1.isExpensiveString());
		System.out.println(korvaKlapid1.isExpensive() ? "K�rvaklapid on kallid" : "K�rvaklapid on odavad");
		
		Headphone korvaKlapid2 = new Headphone("Samsung");
		korvaKlapid2.setPrice(154.50);
		System.out.println(korvaKlapid2);
		
		Student student1 = new Student("Tom", "Saar", new ArrayList<>(Arrays.asList("Keemia","Matemaatika")));
		System.out.println(student1);
		
		Student student2 = new Student("Tom", "Saar", new GregorianCalendar(2013,1,28), Type.ESMAKURSULANE);
		System.out.println(student2);
		
		
		
		List<String>specs=new ArrayList(Arrays.asList("mikrofon","m�rasummutaja"));
		Headphone korvaklapid3 =new Headphone("Sony", 180, false, specs);
		korvaklapid3.addSpecification("NFC");
		System.out.println(korvaklapid3);*/
		
List<Student> students = new ArrayList<Student>();
Student mati = new Student("Mati", LocalDate.parse("2001-01-05"),
Type.TUDENG, null);
mati.addSubject(Subject.BIOLOOGIA);
mati.addSubject(Subject.F__SIKA);
//System.out.println(mati);

students.add(mati);
students.add(new Student("Kati", LocalDate.parse("1986-03-08"), null, Type.L_PETAJA, null));

Student vello = new Student("Vello", LocalDate.parse("1980-01-05"), Type.L_PETAJA, "38001055555", Country.RUSSIA);
students.add(vello);
System.out.println(vello.getAgeAsString());

for (Student student : students) {
	System.out.println(student);
}


		}
	}
