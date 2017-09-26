import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		ArraysEx ax = new ArraysEx();

		double[] doubleSize = { 2.5, 45.7, 23.7, 65.3, 13.8, 6.3 };
		double[] doubleSize1 = new double[4];
		doubleSize[0]=2;
		System.out.println(Arrays.toString(doubleSize));
		System.out.println(doubleSize1[doubleSize1.length-1]);
		for (int i = 0; i < doubleSize.length; i++) {
			System.out.println("Index: " + i + "-" + (doubleSize[i] + 4));

		}

String[] names = {"Cheese","chicken","ham","olive"};
System.out.println(names.length );
System.out.println(names[0]);
for (int i = 0; i < names.length; i++) {
	System.out.println(names[i]);
	
}
//Küsida välja massiivist a)esimene element
//b)viimane element c) omal valikul mõni element.
int[] list={5,77,2,48,10,94};
System.out.println();
	}

}
