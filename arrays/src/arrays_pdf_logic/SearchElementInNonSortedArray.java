package arrays_pdf_logic;
//find out the index of the element in the given array by using for loop without sorting the Array. 
public class SearchElementInNonSortedArray {
	public static void main(String[] args) {
		int[] array = {10, 30, 5, 20, 25, 15};
		int n = array.length;
		int k = 15;
		int positionOfK = searchElement(array, n, k );
		System.out.println("position of " +  k  + " in the array at the index of : " + positionOfK);
	}
	static int searchElement(int arr[], int n, int k)
	{
		boolean isAvailable = false;
		int index = 0;
		int flag = 0;
		for(int i = 0; i < n; i++)
		{
			flag++;
			if(arr[i] == k)
			{
				index = i;
				break;
			}
			else if(flag == n)
			{
				isAvailable = true;
			}
		}
		if(isAvailable)
		{
			index = -1;
		}
		return index;
	}
}
