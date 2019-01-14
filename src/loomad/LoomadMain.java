package loomad;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LoomadMain {

	public static void main(String[] args) {

		Koer koer1 = new Koer("Muki", "kolli", LocalDate.of(2009, 12, 23), "must");

		Kass kass1 = new Kass("Miisu", "siiam", LocalDate.of(2017, 4, 8),new Loomapass("Miisu", "siiam", "Kaia Kass", LocalDate.of(2017, 4, 8)));

		System.out.println(koer1);

		System.out.println(kass1);
		System.out.println(kass1.getLoomapass());
	}

}
