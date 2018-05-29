package UT;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;

public class kt_5_1 extends JFrame {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Raamat raamat = new Raamat();

		System.out.print("Sisestage raamatu nimi: ");
		raamat.setNimi(scanner.nextLine());

		System.out.print("Sisestage raamatu keel: ");
		raamat.setKeel(scanner.nextLine());

		System.out.print("Sisestage raamatu autor: ");
		raamat.setAutor(scanner.nextLine());

		System.out.print("Sisestage raamatu ilmumisaasta: ");
		raamat.setIlmumisaasta(scanner.nextLine());

		System.out.print("Sisestage raamatu lehekylgede arv: ");
		raamat.setLehekylgedeArv(scanner.nextLine());

		System.out.print("Sisestage raamatu hinne: ");
		raamat.setHinne(scanner.nextLine());

		System.out.println("\nRaamatu andmekogusse lisamiseks vajutage klahvi \"j\", väljumiseks \"e\".");

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		frame.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == 'j') {

					String line = "\n" + raamat.getNimi() + "#" + raamat.getIlmumisaasta() + "#"
							+ raamat.getLehekylgedeArv() + "#" + raamat.getAutor() + "#" + raamat.getKeel() + "#"
							+ raamat.getHinne();

					try {
						FileWriter fileWriter = new FileWriter("andmebaas.txt", true);
						BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
						PrintWriter printWriter = new PrintWriter(bufferedWriter);

						printWriter.print(line);

						printWriter.flush();
						bufferedWriter.flush();
						fileWriter.flush();

						System.out.println("Kirje lisati andmekogusse");
						frame.dispose();

					} catch (java.io.IOException e1) {
						e1.printStackTrace();
					}
				} else if (e.getKeyChar() == 'e') {
					frame.dispose();
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {

			}
		});
	}

}
