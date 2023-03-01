package arrays_pdf_logic;
//35. Swap odd indexed elements with its immediate next even indexed elements of given array?
import java.util.Arrays;
public class A35 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		//				 0   1   2   3  4    5   6   7   8   9
		System.out.println(Arrays.toString(arrays));
		for(int i = 1; i < arrays.length - 2; i += 2)
		{
			int temp = arrays[i];
			arrays[i] = arrays[i + 1];
			arrays[i + 1] = temp;
		}
		System.out.println(Arrays.toString(arrays));
	}
}

//30, 75, 20, 5, 24, 35, 100, 15, 30, 60