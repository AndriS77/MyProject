package UT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class KT_4_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		KT_4_1 kt = new KT_4_1();

		System.out.printf("Sisestage algarv:");

		int P = scanner.nextInt();
		scanner.close();

		kt.prindiAlgarv(P);
	}

	private List<Integer> jagub(int num) {
		List<Integer> result = new ArrayList<>();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				result.add(i);
			}
		}
		return result;
	}

	private boolean onAlgarv(int num) {
		return jagub(num).size() == 2;
	}

	private void prindiAlgarv(int num) {
		List<String> jagubStr = jagub(num).stream().map(Object::toString).collect(Collectors.toList());
		if (onAlgarv(num)) {
			System.out.println("Algarv.");
		} else {
			System.out.println("Arv " + num + " pole algarv ning jagub arvudega: " + String.join(", ", jagubStr));
		}
	}
}