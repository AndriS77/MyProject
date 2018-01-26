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
		case "merkuur":
			System.out.printf("Teie kaal planeedil %s oleks %.2f kilogrammi", P, X * 0.378);
			break;
		case "veenus":
			System.out.printf("Teie kaal planeedil %s oleks %.2f kilogrammi", P, X * 0.907);
			break;
		case "maa":
			System.out.printf("Teie kaal planeedil %s oleks %.2f kilogrammi", P, X * 1.0);
			break;
		case "marss":
			System.out.printf("Teie kaal planeedil %s oleks %.2f kilogrammi", P, X * 0.377);
			break;
		case "jupiter":
			System.out.printf("Teie kaal planeedil %s oleks %.2f kilogrammi", P, X * 2.364);
			break;
		case "saturn":
			System.out.printf("Teie kaal planeedil %s oleks %.2f kilogrammi", P, X * 1.064);
			break;
		case "uraan":
			System.out.printf("Teie kaal planeedil %s oleks %.2f kilogrammi", P, X * 0.889);
			break;
		case "neptuun":
			System.out.printf("Teie kaal planeedil %s oleks %.2f kilogrammi", P, X * 1.125);
			break;

		}
	}

}
