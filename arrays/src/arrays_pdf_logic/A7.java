package arrays_pdf_logic;
//7. Find out the sum of all even indexed elements from a given int array?
public class A7 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		int sumOfEvenIndex = 0;
		for(int i = 0; i < arrays.length; i += 2)
		{
			sumOfEvenIndex = sumOfEvenIndex + arrays[i];
		}
		System.out.println(sumOfEvenIndex);
	}

}
