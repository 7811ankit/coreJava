package arrays_pdf_logic;
//9. Find out the min value from all even indexed elements from a given int  array?
public class A9 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		int minAtEvenIndex = Integer.MAX_VALUE;
		for(int i = 0; i < arrays.length; i += 2)
		{
			if(minAtEvenIndex > arrays[i])
			{
				minAtEvenIndex = arrays[i];
			}
		}
		System.out.println(minAtEvenIndex);
	}
}
