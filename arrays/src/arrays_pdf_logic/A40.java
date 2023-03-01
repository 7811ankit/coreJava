package arrays_pdf_logic;
//40. Do left shift by two for elements of given array?
import java.util.Arrays;
public class A40 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		//				 0   1   2   3  4    5   6   7   8   9
		System.out.println(Arrays.toString(arrays));
		for(int i = 0; i < arrays.length - 2 ; i++)
		{
			arrays[i] = arrays[i + 2];
		}
		System.out.println(Arrays.toString(arrays));
	}
}
/*
[30, 20, 75, 24, 5, 100, 35, 30, 15, 60]
[75, 24, 5, 100, 35, 30, 15, 60, 15, 60]
*/