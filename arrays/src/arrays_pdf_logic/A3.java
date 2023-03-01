package arrays_pdf_logic;

public class A3 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arrays.length; i++)
		{
			if(max < arrays[i])
			{
				max = arrays[i];
			}
		}
		System.out.println(max);
	}
}
