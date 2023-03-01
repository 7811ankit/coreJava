package arrays_pdf_logic;
//59. Remove elements of one array from another?
import java.util.Arrays;
public class A59 {
	public static void main(String[] args) {
			int[] arrays1 = {30, 20, 75, 24, 35, 100, 45, 40, 15, 60};
			//				  0   1   2   3   4    5   6   7   8   9
			int[] arrays2 = {20, 10, 30, 40, 35};
			System.out.println(Arrays.toString(arrays1));
			for(int i = 0; i < arrays1.length - 1; i++)
			{
				for(int j = 0; j < arrays2.length; j++)
				{
					if(arrays1[i] == arrays2[j])
					{
						arrays1[i] = arrays1[i + 1];
					}
				}
			}
			System.out.println(Arrays.toString(arrays1));
		}
}
