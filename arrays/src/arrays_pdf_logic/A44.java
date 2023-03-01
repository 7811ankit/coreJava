package arrays_pdf_logic;
//44. Do right rotate by three for elements of given array?
import java.util.Arrays;
public class A44 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		//				 0   1   2   3  4    5   6   7   8   9
		System.out.println(Arrays.toString(arrays));
		int temp = arrays[arrays.length - 1];
		int temp1 = arrays[arrays.length - 2];
		int temp2 = arrays[arrays.length - 3];
		for(int i = arrays.length - 1; i > 2; i--)
		{
			arrays[i] = arrays[i - 3];
		}
		arrays[2] = temp;
		arrays[1] = temp1;
		arrays[0] = temp2;
		System.out.println(Arrays.toString(arrays));
	}
}
//30, 15, 60 ,30, 20, 75, 24, 5, 100, 35