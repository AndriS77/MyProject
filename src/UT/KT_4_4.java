package UT;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class KT_4_4 {

	public static void main(String[] args) {
		KT_4_4 kt = new KT_4_4();
		kt.print();
	}

	private int[][] tenXtenArray() {
		int[][] randNum = new int[10][10];
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {

			int sum = 0;
			for (int j = 0; j < 10; j++) {
				int n =  ThreadLocalRandom.current().nextInt(1, 100);
				randNum[i][j] = n;
				sum += randNum[i][j];

			}
		}
		return randNum;
	}

	private String looseCommas(int[][] array, int index) {
		StringBuilder builder = new StringBuilder();
		for (int value : array[index]) {
			builder.append(value + " ");
		}
		return builder.toString();
	}

	private void print() {
		int[][] tenXten = tenXtenArray();

		int maxSum = 0;
		int maxIndex = 0;
		for (int i = 0; i < tenXten.length; i++) {
			
			int sum = 0;
			for (int elem : tenXten[i]) {
				sum += elem;
				if (sum > maxSum) {
					maxSum = sum;
					maxIndex = i + 1;
				}
			}
			System.out.println(i +1 + ". |" + " " + looseCommas(tenXten, i)+ "|" + sum);
			
		}
		System.out.println("Elementide suurim summa on reas nr. " + maxIndex);
	}
}
