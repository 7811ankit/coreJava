package arrays_pdf_logic;
//18. Find out the max value from a second half of given int array?
public class A18 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		int secondHalfMax = Integer.MIN_VALUE;
		for(int i = arrays.length/2; i < arrays.length - 1; i++)
		{
			if(secondHalfMax < arrays[i])
			{
				secondHalfMax = arrays[i];
			}
		}
		System.out.println(secondHalfMax);
	}

}
