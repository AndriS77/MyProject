package UT;

import java.util.Scanner;

public class KT_6_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        String op = "";
        int dec;
        String binary;

        while (!op.equals("v")) {


            if (op.equals("d")) {
                System.out.print("Sisestage kahendkood: ");
                binary = scanner.nextLine();
                System.out.println(toDecimal(binary) + "\n");
            } else if (op.equals("b")) {
                System.out.print("Sisestage kümnendarv: ");
                dec = Integer.parseInt(scanner.nextLine());
                System.out.println(toBinary(dec) + "\n");
            }

            System.out.println("Kahedsüsteemist kümnendsüsteemi teisendamiseks sisestage \"d\", kümnendsüsteemist kahendsüsteemi \"b\" \n" +
                    "ning programmist väljumiseks \"v\".");

            op = scanner.nextLine();
        }
    }

    private static Integer toDecimal(String binary) {
        int dec = 0;

        int multi = 1;

        for (int i = 0; i < binary.length() - 1; i++) {
            multi = multi * 2;
        }


        for (int i = 0; i < binary.length(); i++) {
            dec = dec + Integer.parseInt(binary.substring(i, i + 1)) * multi;
            multi = multi / 2;
        }


        return dec;
    }

    private static String toBinary(int dec) {
        String binary = "";

        if (dec == 0) {
            binary += dec;
        }

        while (dec > 0) {

            if (dec % 2 == 0) {
                binary = 0 + binary;
                dec = dec / 2;
            } else {
                binary = 1 + binary;
                dec = dec - (dec + 1) / 2;
            }
        }
return binary;
	}

}
