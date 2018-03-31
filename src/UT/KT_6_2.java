package UT;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KT_6_2 {

	public static void main(String[] args) {

		 List<Integer> nums = new ArrayList<>();

	        try {
	            Scanner scanner = new Scanner(new File("Pilet.txt"));

	            while (scanner.hasNextLine()) {
	                nums.add(Integer.parseInt(scanner.next()));
	            }


	        } catch (Exception e) {

	        }

	        int[][] ticket = {
	                {nums.get(0), nums.get(1), nums.get(2), nums.get(3), nums.get(4)},
	                {nums.get(5), nums.get(6), nums.get(7), nums.get(8), nums.get(9)},
	                {nums.get(10), nums.get(11), nums.get(12), nums.get(13), nums.get(14)},
	                {nums.get(15), nums.get(16), nums.get(17), nums.get(18), nums.get(19)},
	                {nums.get(20), nums.get(21), nums.get(22), nums.get(23), nums.get(24)}
	        };

	        String line = "";
	        try {
	            Scanner scanner = new Scanner(new File("Numbrid.txt"));
	            while (scanner.hasNext()) {
	                line += scanner.nextLine();
	            }
	        } catch (Exception e) {

	        }

	        String[] numbers = line.replace(",", "").split(" ");
	        List<Integer> list = new ArrayList<>();

	        for (int i = 0; i < numbers.length; i++) {
	            list.add(Integer.parseInt(numbers[i]));
	        }

	        System.out.println("Nurkademäng: " + (corners(ticket, list) ? "võitnud" : "ei võitnud") + "\n"
	                            + "Diagonaalidemäng: " + (diagonals(ticket, list) ? "võitnud" : "ei võitnud") + "\n"
	                            + "Täismäng: " + (full(ticket, list) ? "võitnud" : "ei võitnud")
	        );
	    }

	    private static boolean full(int[][] ticket, List<Integer> list) {
	        for (int i = 0; i < ticket.length; i++) {
	            for (int j = 0; j < ticket[i].length; j++) {
	                if (!list.contains(ticket[i][j])){
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

	    private static boolean diagonals(int[][] ticket, List<Integer> list) {
	        return list.contains(ticket[0][0]) && list.contains(ticket[0][4]) && list.contains(ticket[1][1]) && list.contains(ticket[1][3]) &&
	                list.contains(ticket[2][2]) && list.contains(ticket[3][1]) && list.contains(ticket[3][3]) && list.contains(ticket[4][0]) &&
	                list.contains(ticket[4][4]);
	    }

	    private static boolean corners(int[][] ticket, List<Integer> list) {
	        return list.contains(ticket[0][0]) && list.contains(ticket[0][4]) &&
	list.contains(ticket[4][0]) && list.contains(ticket[4][4]);
	}

}
