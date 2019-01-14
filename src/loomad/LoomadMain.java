package loomad;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LoomadMain {

	public static void main(String[] args) {

		Koer koer1 = new Koer("Muki", "kolli",new GregorianCalendar(2009,18,23), "must");
		
		Kass kass1 = new Kass("Miisu", "siiam", Calendar.getInstance(),new Loomapass("Miisu", "miisu", " Ain Pok ", Calendar.getInstance()));
		System.out.println(koer1);
		
		System.out.println(kass1);
	}

}
