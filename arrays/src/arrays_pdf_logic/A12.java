package arrays_pdf_logic;
//12. Find out the avg value from all odd indexed elements from a given int  array?
public class A12 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		double sumAtOddIndex = 0;
		double avgAtOddIndex = 0;
		int oddIndexCount = 0;
		for(int i = 1; i < arrays.length; i += 2)
		{
			oddIndexCount++;
			sumAtOddIndex = sumAtOddIndex + arrays[i];
			avgAtOddIndex  = sumAtOddIndex / oddIndexCount; 
		}
		System.out.println(avgAtOddIndex);
	}
}
