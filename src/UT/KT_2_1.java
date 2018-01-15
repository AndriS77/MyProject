package UT;

import java.util.Scanner;

public class KT_2_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Teekonna pikkus: ");
		Double P = scanner.nextDouble();
		System.out.println("Tarbitud kütuse kogus: ");
		Double K = scanner.nextDouble();
		System.out.println("Kütuse liitri hind: ");
		Double H = scanner.nextDouble();
		
		Double T, M;
		T = K / (P / 100);
		M = K * H;
		
		System.out.printf("Olete sõitnud %.2f kilomeetrit ning kulutanud %.2f liitrit kütust. Teie auto kütusekulu oli %.2f liitrit 100 kilomeetri kohta. Sõidu maksumus oli %.2f eurot.", P, K, T, M);
		
		scanner.close();
	}

}
