package arrays_pdf_logic;
import java.util.Arrays;
//51. Remove specified indexed element from the given array?
//remove 2nd element from arrays.
public class A51 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		//				 0   1   2   3  4    5   6   7   8   9
		System.out.println(Arrays.toString(arrays));
		for(int i = 1; i < arrays.length - 1; i++)
		{
			arrays[i] = arrays[i + 1];
		}
		int[] temp = arrays;
		arrays = new int[arrays.length - 1];
		for(int i = 0; i < arrays.length; i++)
		{
			arrays[i] = temp[i];
		}
		System.out.println(Arrays.toString(arrays));
	}
}
