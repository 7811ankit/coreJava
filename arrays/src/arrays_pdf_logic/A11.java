package arrays_pdf_logic;
//11. Find out the avg value from all even indexed elements from a given int  array?
public class A11 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		double sumAtEvenIndex = 0;
		double avgAtEvenIndex = 0;
		int evenIndexCount = 0;
		for(int i = 0; i < arrays.length; i += 2)
		{
			evenIndexCount++;
			sumAtEvenIndex = sumAtEvenIndex + arrays[i];
			avgAtEvenIndex  = sumAtEvenIndex / evenIndexCount; 
		}
		System.out.println(avgAtEvenIndex);
	}

}
