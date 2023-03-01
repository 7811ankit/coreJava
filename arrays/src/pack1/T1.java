package pack1;
// find out 2 consugative elements whose absolute diff is min?
import java.util.Arrays;
public class T1 {
	 public static void main(String[] args) 
	  {
		  int[] a1 = {10,20,30,40,50,4,6,9,100,1,6};
			System.out.println(Arrays.toString(a1));
			int diff = 0, minDiff = Integer.MAX_VALUE, index = 0;
			for(int i = 0; i < a1.length-1; i++)//0//1//2
			{
				diff = getAbsDiff(a1[i] - a1[i+1]);//-10// -10
				if(minDiff > (diff))//T//F
				{
					minDiff = diff;//10
					index = i;//0
				}
			}
			System.out.println(a1[index] + "," + a1[index+1]);
		}
	  static int getAbsDiff(int diff)//-10//-10
	  {   
		  if(diff < 0)//true//T
		  {
			  diff = diff*(-1);//10//10
		  }
		  return diff;
	  }
}
 