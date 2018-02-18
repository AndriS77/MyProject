package UT;

import java.util.Scanner;

public class KT_4_3 {


	public static void main(String[] args) {
		
		//Paun ülesande lahendamiseks lisaaega

		Scanner scanner = new Scanner(System.in);
		int euri_20 = 1;
		int euri_10 = 2;
		int euri_5 = 3;
		int coin_2 = 1;
		int coin_1 = 1;
		
		int _20_eurosed =0; int _10_eurosed =0; int _5_eurosed =0; int _2_eurosed_mündid =0; int _1_eurosed_mündid =0;
		
		int kassa_seis =(euri_20 * 20)+ (euri_10 *10) + (euri_5 * 5) + (coin_2*2) + coin_1 ;
		int tagasi_antav_raha = 0;
		System.out.println("Sisestage summa, mida ostja saab tagasi\n");
		int S = scanner.nextInt();
		
		if (S > kassa_seis) {
			System.out.println("Kassas pole piisavalt raha");

		}
	}
}

