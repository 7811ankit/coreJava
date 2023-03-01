package arrays_pdf_logic;
//47. Do left rotate by three for elements of given array
import java.util.Arrays;
public class A47 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		//				 0   1   2   3  4    5   6   7   8   9
		System.out.println(Arrays.toString(arrays));
		int temp = arrays[0]; 
		int temp1 = arrays[1];
		int temp2 = arrays[2];
		for(int i = 0; i < arrays.length - 3; i++)
		{
			arrays[i] = arrays[i + 3];
		}
		arrays[arrays.length - 1] = temp2;
		arrays[arrays.length - 2] = temp1;
		arrays[arrays.length - 3] = temp;
		System.out.println(Arrays.toString(arrays));
	}
}
//24, 5, 100, 35, 30, 15, 60, 30, 20, 75 