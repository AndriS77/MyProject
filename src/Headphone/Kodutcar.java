package Headphone;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kodutcar {

	public static void main(String[] args) {
//		Calendar regDate = new GregorianCalendar(2007, 2, 21);
//		System.out.println(regDate.get(Calendar.YEAR));
		
		Car auto1 = new Car("GT", "sport", "EV 001", new GregorianCalendar(2007, 02, 21));
		System.out.println(auto1);
		
		auto1.addOwner("Tiit Sukk");
		auto1.addOwner("Eve Libe");
		
		System.out.println(auto1);
	}

}
