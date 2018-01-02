package UT;

import java.util.Scanner;

public class KT_2_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Mis on teie brutopalk: ");
		Double B = scanner.nextDouble();

		if (B >= 470) {
			Double T, N;
			T = B * (1 + 0.33 + 0.008);
			N = (B * (1 - 0.016 - 0.02) - 180) * (1 - 0.20) + 180;

			System.out.printf(
					"Kui töötaja brutopalk on %.3f eurot, siis tööandja maksab %.3f eurot ja töötaja saab kätte puhtalt %.3f eurot.",
					B, T, N);
		} else {
			System.out.println("Miinimumpalk on 470 eurot");

		}
		scanner.close();
	}

}
