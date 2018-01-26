package UT;

import java.util.Scanner;

public class KT_3_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Sisestage päevade arv:");
		int P = scanner.nextInt();
		System.out.println("Sisestage sõidude arv:");
		int S = scanner.nextInt();
		System.out.println("Sisestage ühekordse pileti hind:");
		double Y = scanner.nextDouble();
		System.out.println("Sisestage päeva pileti hind:");
		double D = scanner.nextDouble();
		System.out.println("Sisestage kuukaardi hind:");
		double K = scanner.nextDouble();

		if ((P * D) >= (Y * S) && (Y * S) <= (K)) {
			System.out.printf("Soodsaim variant on  ühekordsed piletid.");
		} else if ((Y * S) >= (P * D) && (P * D) <= (K)) {
			System.out.printf("Soodsaim variant on päevapilet.");
		} else if ((Y * S) == (P * D) && (P * D) < (K)) {
			System.out.printf("Soodsaim variant on päevapilet.");
		} else {
			System.out.println("Soodsaim variant on kuukaart.");
		}
		scanner.close();
	}

}