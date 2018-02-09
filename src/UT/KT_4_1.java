package UT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KT_4_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Sisestage algarv:");
		
		int P = scanner.nextInt();
		
		List<Integer> nums = new ArrayList<>();
		
		for (int i = 1; i <= P; i++) {
			if (P % i == 0) {
				nums.add(i);
			}
		}
		
		System.out.println(nums);
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
	
	private boolean primeNum(List<Integer> list) {
		return list.size() == 2;
	}
	
	private void printPrime(int num) {
		if (primeNum(jagub(num))) {
			System.out.println("Algarv.");
		} else {
			System.out.println("Arv " + num + " pole algarv ning jagub arvudega: " + jagub(num));
		}
	}
}