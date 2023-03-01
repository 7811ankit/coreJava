package arrays_pdf_logic;

import java.util.ArrayList;
import java.util.Arrays;
public class ReverseInGroups {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
		int n = arr.size();
		int k = 3;
		reverseInGroups(arr, n, k);
	}
	static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
	    for (int i = 0; i < n; i += k) {
	        int left = i;
	        int right = Math.min(i + k - 1, n - 1);
	        
	        while (left < right) {
	            int temp = arr.get(left);
	            arr.set(left, arr.get(right));
	            arr.set(right, temp);
	            left++;
	            right--;
	        }
	    }
	    System.out.println(arr);
	}
}
