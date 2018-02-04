package UT;

import java.util.Scanner;

public class KT_4_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int b, c;
		System.out.printf("Sisestage algarv:");
		int P = scanner.nextInt();
		b = 1;
		c = 0;
		while (b <= P) {
			if ((P % b) == 0)
				c = c + 1;
			b++;
		}
		if (c == 2)
			System.out.println("Algarv");
		else
			System.out.printf("Arv %d. pole algarv ning jagub arvudega: 1,2,3,4,6,12" + P);
	}
}
