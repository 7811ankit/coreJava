package arrays_pdf_logic;
//10. Find out the max value from all odd indexed elements from a given int  array?
public class A10 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		int maxAtOddIndex = Integer.MIN_VALUE;
		for(int i = 1; i < arrays.length; i += 2)
		{
			if(maxAtOddIndex < arrays[i])
			{
				maxAtOddIndex = arrays[i];
			}
		}
		System.out.println(maxAtOddIndex);
	}

}
