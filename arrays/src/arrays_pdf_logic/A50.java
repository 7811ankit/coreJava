package arrays_pdf_logic;
import java.util.Arrays;
//50. Rotate first half of elements by one and 2nd half of the elements by one separately?
public class A50 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		//				 0   1   2   3  4    5   6   7   8   9
		System.out.println(Arrays.toString(arrays));
		int temp = arrays[0];
		for(int i = 0; i < arrays.length / 2 - 1; i++)
		{
			arrays[i] = arrays[i + 1];
		}
		arrays[arrays.length / 2 - 1] = temp;
		
		System.out.println("***************************");
		int temp1 = arrays[arrays.length / 2];
		for(int i = arrays.length / 2; i < arrays.length - 1; i++)
		{
			arrays[i] = arrays[i + 1];
		}
		arrays[arrays.length - 1] = temp1;
		System.out.println(Arrays.toString(arrays));
	}
}
