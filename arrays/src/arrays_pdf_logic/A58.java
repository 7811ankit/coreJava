package arrays_pdf_logic;
import java.util.Arrays;
//58. Find out missed elements from the given array between min and max element
public class A58 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 35, 100, 35, 30, 15, 60};
		//				 0   1   2   3  4    5   6   7   8   9
		System.out.println(Arrays.toString(arrays));
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arrays.length; i++)
		{
			if(min > arrays[i])
			{
				min = arrays[i];
			}
			else if(max < arrays[i])
			{
				max = arrays[i];
			}
		}

		System.out.println(min +"  "+max);

		boolean isFound;

		for (int i = min; i < max; i++) 
		{
			isFound = false ;				

			for (int j = 0; j < arrays.length; j++) 
			{
				if(i == arrays[j])
				{
					isFound = true ;
					break ;
				}
			}
			if(!isFound)
			{
				System.out.println(i + " ,");
			}
		}

	}
}

