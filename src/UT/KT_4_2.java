package UT;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class KT_4_2 {

	public static void main(String[] args) {
		System.out.printf("Alustame mängu.\n");

		int N = ThreadLocalRandom.current().nextInt(-1000, 1000 + 1);
		Scanner scanner = new Scanner(System.in);

		int counter = 11;

		while (counter > 0) {
			System.out.printf("Sisestage uus arv:\n");
			int X = scanner.nextInt();

			if (X < N) {
				System.out.printf("Peidetud arv on suurem.\n");
				counter--;
			} else if (X > N) {
				System.out.println("Peidetud arv on väiksem.\n");
				counter--;
			} else {
				System.out.printf("Peidetud arv on %d", N);
				break;
			}
		}
		if (counter == 0) {
			System.out.printf("Te kaotasite. Peidetud arv oli %d.", N);
		}
		scanner.close();
	}
}