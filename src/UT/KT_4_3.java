package UT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class KT_4_3 {

	public static void main(String[] args) {

		// Paun ülesande lahendamiseks lisaaega

		Scanner scanner = new Scanner(System.in);
		int euri_20 = 1;
		int euri_10 = 2;
		int euri_5 = 3;
		int coin_2 = 1;
		int coin_1 = 1;

		int _20_eurosed = 0;
		int _10_eurosed = 0;
		int _5_eurosed = 0;
		int _2_eurosed_mündid = 0;
		int _1_eurosed_mündid = 0;
		List<Integer> raha = new ArrayList<>(Arrays.asList(20, 10, 10, 5, 5, 5, 2, 17));

		int total = raha.stream().mapToInt(Integer::intValue).sum();

		/*
		 * int kassa_seis =(euri_20 * 20)+ (euri_10 *10) + (euri_5 * 5) + (coin_2*2) +
		 * coin_1 ;
		 */
		// int[] kassa = {20,10,10,5,5,5,2,1};
		// int sum = IntStream.of(kassa).sum();

		// int tagasi_antav_raha_loendur = 0;
		System.out.println("Sisestage summa, mida ostja saab tagasi\n");
		int S = scanner.nextInt();

		if (S > total) {
			System.out.println("Kassas pole piisavalt raha");

		} else {
			for (int i = 0; i < raha.size(); i++) {
				if (S >= raha.get(i)) {
					switch (raha.get(i)) {
					case 20:
						_20_eurosed++;
						break;
					}
				}

			}
		}
	}
}
