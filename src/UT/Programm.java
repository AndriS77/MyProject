package UT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Programm {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		Programm programm = new Programm();
		Scanner scanner = new Scanner(new File("andmebaas.txt"));
		System.out.println("Andmekoguks on andmebaas");
		System.out.println("Andmebaas sisaldab raamatuid\n");
	    //System.out.println(file.exists());
		
		/*   FileOutputStream fos = new FileOutputStream("output.txt");
		   
		   PrintWriter writer = new PrintWriter(fos);
		   writer.write("The Design and Evolution of C++#1994#461#Bjarne Stroustrup#eng#9");
		   while (scanner.hasNext()) {
			     String line = scanner.nextLine();
			     
			     writer.println(line);
		   }
		   writer.flush();
		   writer.flush();*/
		List<Raamat> list = new ArrayList<>();
		
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			String[] bookInfo = line.split("#");
			list.add(new Raamat(bookInfo[0],bookInfo[1],bookInfo[2],bookInfo[3],bookInfo[4],bookInfo[5]));			//list.add(getRaamat(line));
			
		}
		List<String>pages = new ArrayList<>();
		String page ="";
		for (int i = 1; i <list.size()+1; i++) {
			page += i + ". " + list.get(i-1) + "\n";
			
			if (i % 5 == 0 || i == list.size()) {
				pages.add(page);
				page ="";
			
			}}
		int pageNumber =0;
	//	System.out.println(pages.get(1));
		Scanner inputScanner = new Scanner(System.in);
		String key = "";
		while(key != "v") {
			if(key.equals("j") && pageNumber < pages.size()-1) {
				pageNumber++;
			} else if (key.equals("e") && pageNumber > 0 ) {
				pageNumber--;
			}
			System.out.println(pages.get(pageNumber));
			key = inputScanner.nextLine();
		}
		
	}
		}