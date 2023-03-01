package arrays_pdf_logic;
//17. Find out the max value from a first half of given int array?
public class A17 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		int firstHalfMax = Integer.MIN_VALUE;
		for(int i = 0; i < arrays.length / 2; i++)
		{
			if(firstHalfMax < arrays[i])
			{
				firstHalfMax = arrays[i];
			}
		}
		System.out.println(firstHalfMax);
	}
}
