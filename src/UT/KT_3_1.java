package UT;

import java.util.Scanner;

public class KT_3_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double S1, S2;
		System.out.println("Sisestage ringi raadius:");
		double R = scanner.nextDouble();
		System.out.println("Sisestage ruudu külje pikkus:");
		double K = scanner.nextDouble();

		S1 = Math.PI * (R * R);
		S2 = K * K;
		if (S1 < S2) {
			System.out.printf("Ringi pindala on %.2f . Ruudu pindala on %.2f. Ruudu pindala on suurim.", S1, S2);
		} else {
			System.out.printf("Ringi pindala on %.2f. Ruudu pindala on %.2f. Ringi pindala on suurim.", S1, S2);
		}
		scanner.close();

	}

}
