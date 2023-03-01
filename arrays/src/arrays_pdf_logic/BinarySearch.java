package arrays_pdf_logic;
//find out the index of the element in the sorted array by using while loop.
import java.util.Arrays;
public class BinarySearch {
	public static void main(String[] args) {
		int[] array = {10, 30, 5, 20, 25, 15};
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array.length - 1; j++)
			{
				if(array[j] > array[j + 1])
				{
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));		//5, 10, 15, 20, 25, 30
		int n = array.length;
		int k = 5;
		int positionOfK = binarySearch(array, n, k);
		System.out.println("position of " + k + " in the given array is : " + positionOfK);
	}
	static int binarySearch(int[] arr, int n, int k)
	{
		int left = 0;
		int right = n - 1;
		while(left <= right)
		{
			int mid = (left + right) / 2;
			if(arr[mid] == k)
			{
				return mid;
			}
			else if(arr[mid] < k)
			{
				left = mid + 1;
			}
			else if(arr[mid] > k)
			{
				right = mid - 1;
			}
		}
		return -1;
	}
}
