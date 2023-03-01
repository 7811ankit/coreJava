package arrays_pdf_logic;
//37. Do right shift by two for elements of given array?
import java.util.Arrays;
public class A37 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		//				 0   1   2   3  4    5   6   7   8   9
		System.out.println(Arrays.toString(arrays));
		for(int i = arrays.length - 1; i > 1 ; i--)
		{
			arrays[i] = arrays[i - 2];
		}
		System.out.println(Arrays.toString(arrays));
	}
}
//30, 20, 30, 20, 75, 24, 5, 100, 35, 30