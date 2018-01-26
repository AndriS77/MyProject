package UT;

import java.util.Scanner;
public class nt_3 {

	public static void main(String[] args) {

		// deklareerime vajalikud muutujad
	    int n;
	    double t, o, m;
	    Scanner scanner = new Scanner(System.in);

	    // esitame valikuinfo kasutajale
	    System.out.printf("PROTSENTARVUTUSED\n");
	    System.out.printf("[1] Osam‰‰ra M leidmine terviku T ja osa O j‰rgi\n");
	    System.out.printf("[2] Osa O m‰‰ramine protsendi M ja terviku T j‰rgi\n");
	    System.out.printf("[3] Terviku T m‰‰ramine protsendi M ja vastav osa O j‰rgi\n");
	    // sisestame kasutaja valiku
	    System.out.printf("Palun sisesta vajalik ¸lesandet¸¸p : ");
	    n = scanner.nextInt();
	    if (n == 1) { // kui valiti 1. variant, siis sisestame teadaolevad v‰‰rtused
	      System.out.printf("Palun sisesta terviku v‰‰rtus : ");
	      t = scanner.nextDouble();
	      System.out.printf("Palun sisesta osa v‰‰rtus : ");
	      o = scanner.nextDouble();
	      // ja teatame arvutuste tulemuse
	      System.out.printf("Osam‰‰r on %5.1f%%\n", o / t * 100);
	    } else if (n == 2) {
	      System.out.printf("Palun sisesta terviku v‰‰rtus : ");
	      t = scanner.nextDouble();
	      System.out.printf("Palun sisesta protsendi v‰‰rtus : ");
	      m = scanner.nextDouble();
	      System.out.printf("Osa v‰‰rtus on %.1f\n", t / 100 * m);
	    } else if (n == 3) {
	      System.out.printf("Palun sisesta protsendi v‰‰rtus : ");
	      m = scanner.nextDouble();
	      System.out.printf("Palun sisesta osa v‰‰rtus : ");
	      o = scanner.nextDouble();
	      System.out.printf("Terviku v‰‰rtus on %.1f\n", o / m * 100);
	    }
	  }
	}
