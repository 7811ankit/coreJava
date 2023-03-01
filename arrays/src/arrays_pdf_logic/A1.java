package arrays_pdf_logic;

import java.util.Arrays;

//1. Find the sum of all given elements from an int array?
public class A1 {
	public static void main(String[] args) {
		int[] arrays = {10, 20, 70, 40, 50, 100, 90, 30, 80, 60};
		System.out.println(Arrays.toString(arrays));
		int sum = 0;
		for(int i = 0; i < arrays.length; i++)
		{
			sum = sum + arrays[i];
		}
		System.out.println(sum);
	}
}
