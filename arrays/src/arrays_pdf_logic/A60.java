package arrays_pdf_logic;
import java.util.Arrays;
//60. Retain one array elements in another array?
public class A60 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[] arrays1 = {30, 20, 75, 24, 35, 100, 45, 40, 15, 60};
		//				  0   1   2   3   4    5   6   7   8   9
		System.out.println(Arrays.toString(arrays1));
		for(int i = 0; i < arrays1.length - 1; i++)
		{
			for(int j = i + 1; j < arrays1.length; j++)
			{
				if(arrays1[i] > arrays1[j])
				{
					int temp = arrays1[i];
					arrays1[i] = arrays1[j]; 
					arrays1[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arrays1));
	}
}
//30, 20, 24, 35, 40