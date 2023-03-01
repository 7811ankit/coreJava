package pack1;
/*Add two array element into 3rd array by considering element
	from both arrays one by one?	*/
import java.util.Arrays;
public class T2 {
	public static void main(String[] args) {
		int[]a1 = {10,20,30,40,50,4,6,9,100,1,6};
		int[]a2 = {101, 201, 310, 401, 501};
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		int[]a3 = new int[a1.length + a2.length];
		int maxSize = a1.length > a2.length ? a1.length: a2.length;
		for(int i = 0,j = 0; i < maxSize; i++)//i = 0, 1, 2, 3, 4
		{
			if(i < a1.length) //a1.length = 11
			{
				a3[j++]= a1[i];//j = 0, 1, 
			}
			if(i < a2.length) // a2.length = 5
			{
				a3[j++] = a2[i];
			}
		}
		System.out.println(Arrays.toString(a3));
	}

}
//  10, 101, 20, 201, 30, 310, 40, 401, 50, 501, 4, 6, 9, 100, 1, 6 
//j= 0    1   2	   3   4    5   6    7   8    9  10,11,12, 13, 14,15