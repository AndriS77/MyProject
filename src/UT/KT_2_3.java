package UT;

import java.util.Scanner;

public class KT_2_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sisestage laenusumma eurodes: ");
		Double S = scanner.nextDouble();
		System.out.println("Sisestage laenuperiood aastades: ");
		Double Y = scanner.nextDouble();
		System.out.println("Sisestage intressim‰‰r protsentides: ");
		Double P = scanner.nextDouble();
		
		Double K,T;
		K = (S * (P/100/12)) / (1 - (1 + (P/100/12)) + (-Y*12));
		T = K * Y * 12;
		
		System.out.printf("Laenusummaga %.2f eurot %.2f intressim‰‰raga te peate maksma %.2f eurot kuus %.2f aastat. Ja kokku maksate pangale %.2f eurot.",S,P,K,Y,T);
	}

}
