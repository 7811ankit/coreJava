package arrays_pdf_logic;
//4. Find the 2nd min element from the given int array?
public class A4 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE - 10;
		for(int i = 0; i < arrays.length; i++)
		{
			if(min > arrays[i])
			{
				secondMin = min;//Integer.MAX_VALUE,30,20,
				min = arrays[i];//30,20,5,
			}
			else if(secondMin > arrays[i])//20
			{
				secondMin = arrays[i];//15
			}
		}
		System.out.println(secondMin);
	}
}
