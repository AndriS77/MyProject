package UT;

import java.util.Scanner;

public class KT_3_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Sisestage p�evade arv:");
		int P = scanner.nextInt();
		System.out.println("Sisestage s�idude arv:");
		int S = scanner.nextInt();
		System.out.println("Sisestage �hekordse pileti hind:");
		double Y = scanner.nextDouble();
		System.out.println("Sisestage p�eva pileti hind:");
		double D = scanner.nextDouble();
		System.out.println("Sisestage kuukaardi hind:");
		double K = scanner.nextDouble();

		if ((P * D) >= (Y * S) && (Y * S) <= (K)) {
			System.out.printf("Soodsaim variant on  �hekordsed piletid.");
		} else if ((Y * S) >= (P * D) && (P * D) <= (K)) {
			System.out.printf("Soodsaim variant on p�evapilet.");
		} else if ((Y * S) == (P * D) && (P * D) < (K)) {
			System.out.printf("Soodsaim variant on p�evapilet.");
		} else {
			System.out.println("Soodsaim variant on kuukaart.");
		}
		scanner.close();
	}

}