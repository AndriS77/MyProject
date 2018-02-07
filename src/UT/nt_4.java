package UT;

import java.util.Scanner;

public class nt_4 {

	public static void main(String[] args) {
		 System.out.printf("See programm leiab arvujada suurima v‰‰rtuse.\n");
		    System.out.printf("Palun sisesta jada pikkus: ");
		    Scanner scanner = new Scanner(System.in);
		    int n = scanner.nextInt();    /* jada tegelik pikkus */
		    int jada[] = new int[n];      /* arvude massiiv */
		    for (int i = 0; i < n; i++) {// k¸sime n arvu
		      System.out.printf("Palun sisesta jada %d. elemendi v‰‰rtus : ", i + 1);
		      jada[i] = scanner.nextInt();
		    }
		    System.out.printf("T‰nan! Otsin suurimat v‰‰rtust ...\n");
		    int max = jada[0];            /* alguses vıtan suurimaks esimese v‰‰rtuse */
		    for (int i = 1; i < n; i++) { /* kontrollin kıiki jadaliikmeid. */
		      if (jada[i] > max) {        /* kas vaadeldav v‰‰rtus on eelmistest suurem */
		        max = jada[i];            /* kui, on siis j‰tan meelde */
		      }
		    }
		    System.out.printf("Jada suurim v‰‰rtus on %d", max);

		
	}

}
