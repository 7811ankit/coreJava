package arrays_pdf_logic;
//14. Find out the sum of all elements from a second half of given int array?
public class A14 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		int secondHalfSum = 0;
		for(int i = arrays.length / 2; i < arrays.length; i++)
		{
			secondHalfSum = secondHalfSum + arrays[i];
		}
		System.out.println(secondHalfSum);
	}
}
