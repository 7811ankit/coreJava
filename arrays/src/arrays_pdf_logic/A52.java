package arrays_pdf_logic;
import java.util.Arrays;
//52. Update specified indexed element with a new element
//from the given array?
public class A52 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		//				 0   1   2   3  4    5   6   7   8   9
		System.out.println(Arrays.toString(arrays));
		arrays[arrays.length / 2] = 500;
		System.out.println(Arrays.toString(arrays));
	}

}
