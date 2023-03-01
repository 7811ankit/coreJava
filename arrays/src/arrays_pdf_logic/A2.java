package arrays_pdf_logic;

import java.util.Arrays;

//2. Find the min element from the given int array?
public class A2{
	public static void main(String[] args) {
		int[] arrays = {10, 20, 70, 40, 5, 100, 90, 30, 80, 60};
		System.out.println(Arrays.toString(arrays));
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arrays.length; i++)
		{
			if(min > arrays[i])
			{
				min = arrays[i];
			}
		}
		System.out.println(min);
	}
}
