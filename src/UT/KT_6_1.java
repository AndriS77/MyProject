package UT;

import java.util.Random;

public class KT_6_1 {

	public static void main(String[] args) {

		Random random = new Random();

        int[][] m1 = {{random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)},
                {random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)},
                {random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)},
                {random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)}};

        int[][] m2 = {{random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)},
                {random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)},
                {random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)},
                {random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)}};

        int[][] m3 = {{random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)},
                {random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)},
                {random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)},
                {random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)}};

        System.out.println(printMatrix(m1));
        System.out.println(printMatrix(m2));
        System.out.println(printMatrix(m3));

        int[][] highest = compare(m1, m2);
        highest = compare(highest, m3);

        System.out.println("Suurim matrix\n\n" + printMatrix(highest));

    }


    private static int[][] compare(int[][] m1, int[][] m2) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                sum1 += m1[i][j];
            }
        }

        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                sum2 += m2[i][j];
            }
        }

        return sum1 > sum2 ? m1 : m2;
    }

    private static String printMatrix(int[][] matrix) {
        String output = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                output += matrix[i][j] + " ";
            }
            output += "\n";
        }

        return output;
	}

}
