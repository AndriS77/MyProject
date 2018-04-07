package UT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class KT_4_3 {

	public static void main(String[] args) {

		// Paun �lesande lahendamiseks lisaaega

		Scanner scanner = new Scanner(System.in);

		int _20_eurosed = 0;
		int _10_eurosed = 0;
		int _5_eurosed = 0;
		int _2_eurosed_myndid = 0;
		int _1_eurosed_myndid = 0;
		List<Integer> raha = new ArrayList<>(Arrays.asList(20, 10, 10, 5, 5, 5, 2, 1));

		int total = raha.stream().mapToInt(Integer::intValue).sum();

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
					case 10:
						_10_eurosed++;
						break;
					case 5:
						_5_eurosed++;
						break;
					case 2:
						_2_eurosed_myndid++;
						break;
					case 1:
						_1_eurosed_myndid++;
						break;
					}
					S -= raha.get(i);
				}

			}
			if (S != 0) {
				System.out.println("Pole võimalik anda täpne raha tagasi");
			} else {
				String summa = "Tagasi tuleb anda:";
				if (_20_eurosed != 0) {
					summa += "\n20-eurosed: " + _20_eurosed + "tk";
				}
				if (_10_eurosed != 0) {
					summa += "\n10-eurosed: " + _10_eurosed + "tk";
				}
				if (_5_eurosed != 0) {
					summa += "\n5-eurosed: " + _5_eurosed + "tk";
				}
				if (_2_eurosed_myndid != 0) {
					summa += "\n2-eurosed: " + _2_eurosed_myndid + "tk";
				}
				if (_1_eurosed_myndid != 0) {
					summa += "\n1-eurosed: " + _1_eurosed_myndid + "tk";
				}
				System.out.println(summa);
			}
		}
	}
}
