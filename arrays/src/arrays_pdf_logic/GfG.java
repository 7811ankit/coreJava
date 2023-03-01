package arrays_pdf_logic;
//find out missing element in a given array
public class GfG {
	static int n;
	static int[] a;
	public static void main(String[] args) {
		int[] a1 = {1, 2, 3, 4, 6, 7, 8, 9, 10};
		int n = 10;
		int missingNumber = missingNumber(a1,n);
		System.out.println(missingNumber);
		
	}
	static int missingNumber(int[] array, int n)
	{
		int totalSum = n * (n + 1)/2;
		int sum = 0;
		for(int i = 0; i < array.length; i++)
		{
			sum = sum + array[i];
		}
		int missingElement = totalSum - sum;
		return missingElement;
	}
}
