package arrays_pdf_logic;
//13. Find out the sum of all elements from a first half of given int array?
public class A13 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		int firstHalfSum = 0;
		for(int i = 0; i < arrays.length / 2; i++)
		{
			firstHalfSum = firstHalfSum + arrays[i];
		}
		System.out.println(firstHalfSum);
	}

}
