package arrays_pdf_logic;
//15. Find out the min value from a first half of given int array?
public class A15 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		int firstHalfMin = Integer.MAX_VALUE;
		for(int i = 0; i < arrays.length / 2; i++)
		{
			if(firstHalfMin > arrays[i])
			{
				firstHalfMin = arrays[i];
			}
		}
		System.out.println(firstHalfMin);
	}
}
