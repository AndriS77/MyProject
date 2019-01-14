package ruumid;

import java.util.GregorianCalendar;

public class RuumidMain {


	public static void main(String[] args) {
		Klassiruum ruum263 = new Klassiruum(2, "263A", 15);
		System.out.println(ruum263);

		Arvutiklass ruum264 = new Arvutiklass(2, "264", 16);
		ruum264.lisaArvuti("hp arvuti", new GregorianCalendar(2011, 11, 23));
		
		System.out.println(ruum264);
		
	}

}
