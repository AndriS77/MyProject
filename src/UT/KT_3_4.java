package UT;

import java.util.Scanner;

public class KT_3_4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Sisestage x v‰‰rtus:");
		int x = scanner.nextInt();
		
		int v;
		if (x < 0 ) {
			System.out.println("Funktsiooni F v‰‰rtus kohal x on 0.");
			}else if (x <=7) {
				v=(x* x);
					System.out.println("Funktsiooni F v‰‰rtus kohal x on " + v);
			}else {
				v=(3 * x + 51);
				System.out.println("Funktsiooni F v‰‰rtus kohal x on " + v);
			}
		scanner.close();
		}
	}

