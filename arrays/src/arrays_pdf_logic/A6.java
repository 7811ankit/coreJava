package arrays_pdf_logic;
//6. Find the average value of an int array?
public class A6 {
	public static void main(String[] args) {
		int[] arrays = {30, 20, 75, 24, 5, 100, 35, 30, 15, 60};
		double sum = 0;
		double avg = 0;
		for(int i = 0; i < arrays.length; i++)
		{
			sum = sum + arrays[i];
			avg = sum / arrays.length; 
		}
		System.out.println(avg);
	}
}
