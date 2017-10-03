package year_1;

public class LoopsDemo {

	public static void main(String[] args) {
		// For-ts�kkel
				for (int i = 1; i < 11; i++) {
					System.out.println("For-loop count:" + i);
				}

				System.out.println();

				// For Each ts�kkel
				int[] numbers = { 5, 6, 7 };
				for (int number : numbers) {
					System.out.println("ForEach number: " + number);
				}

				// While
				int count = 1;
				while (count < 11) {
					System.out.println("Count is: " + count);
					count++;
				}
				
				printNums0To10();
				printSumTo10();
			}
			
			private static void printNums0To10() {
				for (int i = 0; i < 11; i++) {
					System.out.println(i);
				}
	}
			private static void printSumTo10() {
				int[] numbers = {3,2,2,1,4};
				int sum = 0;
				int i =1;
				do{
					sum=sum+i;
				}
				while (sum < 10) ;
				System.out.println(sum);
					
				}
			}


