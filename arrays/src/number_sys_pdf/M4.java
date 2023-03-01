package number_sys_pdf;
//4. Print ascending order of 3 given numbers
import java.util.Scanner;
public class M4 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    
		    System.out.print("Enter the first number: ");
		    int a = input.nextInt();
		    
		    System.out.print("Enter the second number: ");
		    int b = input.nextInt();
		    
		    System.out.print("Enter the third number: ");
		    int c = input.nextInt();
		    
		    input.close();
		    int min = 0, mid = 0, max = 0;
		    
		    if(a >= b && a >= c)
		    {
		    	max = a;
		    	if(b >= c)
		    	{
		    		mid = b;
		    		min = c;
		    	}
		    	else {
		    		mid = c;
		    		min = b;
		    	}
		    }
		    if(b >= a && b >= c)
		    {
		    	max = b;
		    	if(a >= c)
		    	{
		    		mid = a;
		    		min = c;
		    	}
		    	else {
		    		mid = c;
		    		min = a;
		    	}
		    }
		    if(c >= a && c >= b)
		    {
		    	max = c;
		    	if(b >= a)
		    	{
		    		mid = b;
		    		min = a;
		    	}
		    	else {
		    		mid = a;
		    		min = b;
		    	}
		    }
		    System.out.println("the ascending order is " + min + ", " + mid + ", " + max);
	}
}