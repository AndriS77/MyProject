package UT;

import java.util.Arrays;
import java.util.Random;

public class KT_4_4 {

	public static void main(String[] args) {

		int[] randomNumbers = new int[10];
		Random rand = new Random();
		for (int i = 1; i <= 10; i++) {

			int sum = 0;
			for (int j = 0; j < randomNumbers.length; j++) {
				int n = rand.nextInt(100);
				randomNumbers[j] = n;
				sum += randomNumbers[j];

			}
			System.out.println(i + "." + Arrays.toString(randomNumbers) + sum);
		}

	}
}
