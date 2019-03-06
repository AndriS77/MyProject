package UT;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Game game = new Game();

		boolean answer = true;

		int i = 0;
		while (answer) {
			System.out.println(game.getRounds().get(i).getQuestion() + "\n" + "\n Vastuse varjandid on \n");
			game.getRounds().get(i).printChoices();

			if (game.isFiftyfifty()) {
				System.out.println("\n Soovimaks kasutada õlekõrt 50:50 sisesta \"h\"\n");
			}
			System.out.println("\nSisestage vastus: ");
			String insert = scanner.nextLine();
			if (insert.equals("h")) {
				System.out.println(
						game.fiftyFifity(game.getRounds().get(i).getChoices(), game.getRounds().get(i).getAnswer()));

				System.out.println("\nSisestage vastus: ");
				insert = scanner.nextLine();
			}
			if (insert.equals(game.getRounds().get(i).getAnswer())) {
				System.out.println("Õige vastus! Oled võitnud " + game.getRounds().get(i).getValue() + "€");
				i++;
				if (i == 15) {
					answer = false;
				}
			} else {
				System.out.println("Vale vastus!\nSa kaotasid.");
				answer = false;
			}
		}
	}
}
