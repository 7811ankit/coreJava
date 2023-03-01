package arrays_pdf_logic;
//16. Find out the min value from a second half of given int array?
public class A16 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		int secondHalfMin = Integer.MAX_VALUE;
		for(int i = arrays.length / 2; i < arrays.length ; i++)
		{
			if(secondHalfMin > arrays[i])
			{
				secondHalfMin = arrays[i];
			}
		}
		System.out.println(secondHalfMin);

	}
}
