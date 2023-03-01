package arrays_pdf_logic;

import java.util.Arrays;
//30. Reverse the elements of given array?
public class A30 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		System.out.println(Arrays.toString(arrays));
		for(int i = 0; i < arrays.length / 2; i++)
		{
			int temp = arrays[i];
			arrays[i] = arrays[arrays.length - 1 - i];
			arrays[arrays.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(arrays));
	}
}
