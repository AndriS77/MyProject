package UT;

import java.util.Scanner;

public class KT_3_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sisestage p�eva numbri k:");
		int k = scanner.nextInt();
		
		if (1 <= k && k <=365) {
			int n = k % 7;
			switch (n) {
			case 0:
				System.out.printf("Aasta %d. p�ev on p�hap�ev",k);
				break;
			case 1:
				System.out.printf("Aasta %d. p�ev on esmasp�ev",k);
				break;
			case 2:
				System.out.printf("Aasta %d. p�ev on teisip�ev",k);
				break;
			case 3:
				System.out.printf("Aasta %d. p�ev on kolmap�ev",k);
				break;
			case 4:
				System.out.printf("Aasta %d. p�ev on neljap�ev",k);
				break;
			case 5:
				System.out.printf("Aasta %d. p�ev on reede",k);
				break;
			case 6:
				System.out.printf("Aasta %d. p�ev on laup�ev",k);
				break;
			}
		}
		scanner.close();
	}

}
