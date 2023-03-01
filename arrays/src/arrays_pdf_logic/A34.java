package arrays_pdf_logic;
//34. Reverse only odd indexed of the elements of given array?
import java.util.Arrays;
public class A34 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		//				 0   1   2   3  4    5   6   7   8   9
		System.out.println(Arrays.toString(arrays));
		for(int i = 1; i < arrays.length / 2 - 1; i += 2)
		{
			int temp = arrays[i];
			arrays[i] = arrays[arrays.length - i];
			arrays[arrays.length - i] = temp;
		}
		System.out.println(Arrays.toString(arrays));
	}
}
//30, 60, 75, 30, 5, 100, 35, 24, 15, 20