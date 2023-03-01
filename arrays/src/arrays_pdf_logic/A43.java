package arrays_pdf_logic;
//43. Do right rotate by two for elements of given array?
import java.util.Arrays;
public class A43 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		//				 0   1   2   3  4    5   6   7   8   9
		System.out.println(Arrays.toString(arrays));
		int temp = arrays[arrays.length - 1];
		int temp1 = arrays[arrays.length - 2];
		for(int i = arrays.length - 1; i > 1; i--)
		{
			arrays[i] = arrays[i - 2];
		}
		arrays[0] = temp1;
		arrays[1] = temp;
		System.out.println(Arrays.toString(arrays));
	}
}
// 15, 60, 30, 20, 75, 24, 5, 100, 35, 30