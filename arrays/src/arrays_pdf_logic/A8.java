package arrays_pdf_logic;
//8. Find out the sum of all odd indexed elements from a given int array?
public class A8 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		int sumOfOddIndex = 0;
		for(int i = 1; i < arrays.length; i += 2)
		{
			sumOfOddIndex = sumOfOddIndex + arrays[i];
		}
		System.out.println(sumOfOddIndex);
	}

}
