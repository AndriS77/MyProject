package UT;

import java.util.Scanner;

public class KT_3_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Sisestage kaal kilogrammides: ");
		double X = scanner.nextDouble();
		System.out.println("Sisestage planeet (merkuur, veenus, maa, marss, jupiter, saturn, uraan, neptuun): ");
		String P = scanner.next();

		switch (P) {
		case "Merkuur":
			System.out.printf("Teie kaal planeedil %s oleks %.2f kilogrammi", P, X * 0.378);

			break;
		case "Veenus":
			System.out.printf("Teie kaal planeedil %s oleks %.2f kilogrammi", P, X * 0.907);
			break;
		case "Maa":
			System.out.printf("Teie kaal planeedil %s oleks %.2f kilogrammi", P, X * 0.907);
			break;
		case "Marss":
			System.out.printf("Teie kaal planeedil %s oleks %.2f kilogrammi", P, X * 0.907);
			break;
		case "Jupiter":
			System.out.printf("Teie kaal planeedil %s oleks %.2f kilogrammi", P, X * 0.907);
			break;
		case "Saturn":
			System.out.printf("Teie kaal planeedil %s oleks %.2f kilogrammi", P, X * 0.907);
			break;
		case "Uraan":
			System.out.printf("Teie kaal planeedil %s oleks %.2f kilogrammi", P, X * 0.907);
			break;
		case "Neptuun":
			System.out.printf("Teie kaal planeedil %s oleks %.2f kilogrammi", P, X * 0.907);
			break;

		}
	}

}
