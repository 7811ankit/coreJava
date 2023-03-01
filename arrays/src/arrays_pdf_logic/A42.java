package arrays_pdf_logic;
//42. Do right rotate by one for elements of given array?
import java.util.Arrays;
public class A42 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		//				 0   1   2   3  4    5   6   7   8   9
		System.out.println(Arrays.toString(arrays));
		int temp = arrays[arrays.length - 1];
		for(int i = arrays.length - 1; i > 0; i--)
		{
			arrays[i] = arrays[i - 1];
		}
		arrays[0] = temp;
		System.out.println(Arrays.toString(arrays));
	}
}
