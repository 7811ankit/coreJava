package arrays_pdf_logic;
//41. Do left shift by three for elements of given array?
import java.util.Arrays;
public class A41 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		//				 0   1   2   3  4    5   6   7   8   9
		System.out.println(Arrays.toString(arrays));
		for(int i = 0; i < arrays.length - 3 ; i++)
		{
			arrays[i] = arrays[i + 3];
		}
		System.out.println(Arrays.toString(arrays));
	}
}
/*
[30, 20, 75, 24, 5, 100, 35, 30, 15, 60]
[24, 5, 100, 35, 30, 15, 60, 30, 15, 60]

*/