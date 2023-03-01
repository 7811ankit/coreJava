package arrays_pdf_logic;
import java.util.Arrays;
//57. Remove the duplicates from the given array?
public class A57 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 35, 100, 35, 30, 15, 60};
		//				 0   1   2   3  4    5   6   7   8   9
		System.out.println(Arrays.toString(arrays));
		int duplicateCount = 0;
		for(int i = 0; i < arrays.length - duplicateCount; i++)
		{
			for(int j = i + 1; j < arrays.length - duplicateCount; j++)
			{
				if(arrays[i] == arrays[j])
				{
					for(int k = j; k < arrays.length - duplicateCount - 1; k++)
					{
						arrays[k] = arrays[k + 1];
					}
					j--;
					duplicateCount++;
				}
			}
		}
		int[] temp = arrays;
		arrays = new int[arrays.length - duplicateCount];
		for(int i = 0; i < arrays.length; i++)
		{
			arrays[i] = temp[i];
		}
		System.out.println(Arrays.toString(arrays));
	}

}
