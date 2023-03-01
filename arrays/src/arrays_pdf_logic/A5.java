package arrays_pdf_logic;
//5. Find the 2nd max element from the given int array?
public class A5 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE + 10;
		for(int i = 0; i < arrays.length; i++)
		{
			if(max < arrays[i])
			{
				secondMax = max;
				max = arrays[i];
			}
			else if(secondMax < arrays[i])
			{
				secondMax = arrays[i];
			}
		}
		System.out.println(secondMax);
	}
}
