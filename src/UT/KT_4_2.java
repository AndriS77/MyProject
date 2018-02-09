package UT;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class KT_4_2 {

	public static void main(String[] args) {
		System.out.printf("Alustame mängu.\n");
		
//		double N = (-1000 + Math.random() * 1000);
		
		int N = ThreadLocalRandom.current().nextInt(-1000, 1000 + 1);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Sisestage uus arv:");
		int X = scanner.nextInt();
		
		int counter = 11;
		
		while(X > N || X < N && counter > 0);
		if (X < N) {
			System.out.printf("Peidetud arv on suurem.");
			counter--;
		} else if (X > N) {
			System.out.println("Peidetud arv on väiksem.");
			counter--;
		} else {
			System.out.printf("Peidetud arv on %f", N);
			counter = counter - counter;
		}
		
		
	}

}
