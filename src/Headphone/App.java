package Headphone;

public class App {

	public static void main(String[] args) {
		Headphone korvaKlapid1 = new Headphone("Bludio", 50, false);
		System.out.println(korvaKlapid1);
		System.out.println("Kas on kallis: " + korvaKlapid1.isExpensiveString());
		System.out.println(korvaKlapid1.isExpensive() ? "Kõrvaklapid on kallid" : "Kõrvaklapid on odavad");
		
		Headphone korvaKlapid2 = new Headphone("Samsung");
		korvaKlapid2.setPrice(154.50);
		System.out.println(korvaKlapid2);
		
		Student student1 = new Student();
		System.out.println(student1);
	}
}
