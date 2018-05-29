package UT;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;

public class kt_5 extends JFrame {

	public static void main(String[] args) throws FileNotFoundException {

		kt_5 programm = new kt_5();
		Scanner scanner = new Scanner(new File("andmebaas.txt"));
		System.out.println("Andmekoguks on andmebaas");
		System.out.println("Andmebaas sisaldab raamatuid\n");

		List<Raamat> list = new ArrayList<>();

		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			String[] bookInfo = line.split("#");
			list.add(new Raamat(bookInfo[0], bookInfo[1], bookInfo[2], bookInfo[3], bookInfo[4], bookInfo[5])); // list.add(getRaamat(line));

		}
		List<String> pages = new ArrayList<>();
		String page = "";
		for (int i = 1; i < list.size() + 1; i++) {
			page += i + ". " + list.get(i - 1) + "\n";

			if (i % 5 == 0 || i == list.size()) {
				pages.add(page);
				page = "";

			}
		}
		System.out.println(pages.get(0));

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		frame.addKeyListener(new KeyListener() {
			int pageNumber = 0;

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyChar() == 'j' && pageNumber < pages.size() - 1) {
					pageNumber++;
					System.out.println(pages.get(pageNumber));
				} else if (e.getKeyChar() == 'e' && pageNumber > 0) {
					pageNumber--;
					System.out.println(pages.get(pageNumber));
				} else if (e.getKeyChar() == 'v') {
					frame.dispose();
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}
}