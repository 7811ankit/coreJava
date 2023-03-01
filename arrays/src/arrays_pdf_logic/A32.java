package arrays_pdf_logic;
//32. Reverse only last half of the elements of given array?
import java.util.Arrays;
public class A32 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		System.out.println(Arrays.toString(arrays));
		for(int i = 0; i < 2; i++)
		{
			int temp = arrays[arrays.length / 2 + i];
			arrays[arrays.length / 2 + i] = arrays[arrays.length - 1 - i];
			arrays[arrays.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(arrays));
	}
}

//30, 20, 75, 24, 5, 60, 15, 30, 35, 100