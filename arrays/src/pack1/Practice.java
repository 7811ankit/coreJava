package pack1;
//move all even elements to left side and odd right side ?
import java.util.Arrays;
public class Practice {
public static void main(String[] args) {
		int[]a1 = {10,5,3,40,11,50,7,12,4,8,9,57};
		System.out.println(Arrays.toString(a1));
		int left = 0, right = a1.length-1;
		while(true)
		{
			while(a1[left]%2 == 0)
			{
				left ++; //1 
			}
			while(a1[right]%2 == 1)
			{
				right --; //10
			}
			if(left >= right)
			{
				break;
			}
			int temp = a1[left];
			a1[left] = a1[right];
			a1[right] = temp;
			left ++;
			right --;
		}
		System.out.println(Arrays.toString(a1));
	}
}
