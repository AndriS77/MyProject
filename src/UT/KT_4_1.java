package UT;

import java.util.Scanner;

public class KT_4_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Sisestage algarv:");
		int P = scanner.nextInt();
		for (int i = 2; i <= P; i++) {
			if (P % i == 0 || i == 1) {
				System.out.printf("Arv %d. pole algarv ning jagub arvudega: " +"1"+ i, P);
			}
		}
		/*
		 * int i = 2; while (i <= (P - 1)) { if (P % i == 0) {
		 * System.out.printf("Arv %d. pole algarv ning jagub arvudega: "+i,P); break; }
		 * else { System.out.printf("Algarv"); } i++; }
		 */
	}
}
