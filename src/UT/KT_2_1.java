package UT;

import java.util.Scanner;

public class KT_2_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Teekonna pikkus: ");
		Double P = scanner.nextDouble();
		System.out.println("Tarbitud k�tuse kogus: ");
		Double K = scanner.nextDouble();
		System.out.println("K�tuse liitri hind: ");
		Double H = scanner.nextDouble();
		
		Double T, M;
		T = K / (P / 100);
		M = K * H;
		
		System.out.printf("Olete s�itnud %.2f kilomeetrit ning kulutanud %.2f liitrit k�tust. Teie auto k�tusekulu oli %.2f liitrit 100 kilomeetri kohta. S�idu maksumus oli %.2f eurot.", P, K, T, M);
		
		scanner.close();
	}

}
