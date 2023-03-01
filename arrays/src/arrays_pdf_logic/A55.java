package arrays_pdf_logic;
import java.util.Arrays;
//55. Remove all odd indexed elements from the given array?
public class A55 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		//				 0   1   2   3  4    5   6   7   8   9
		System.out.println(Arrays.toString(arrays));
		for(int i = 1; i < arrays.length - 1; i += 2)
		{
			arrays[i] = arrays[i + 1];
		}
		System.out.println(Arrays.toString(arrays));
	}

}
