package arrays_pdf_logic;
import java.util.ArrayList;
import java.util.Arrays;
public class Practice {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(25);
		list.add(15);
		list.add(5);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(35);
		int[] array = new int[list.size()];
		for(int i = 0; i < array.length; i++)
		{
			array[i] = list.get(i);
		}
	}
}



