package number_sys_pdf;
import java.util.Scanner;
//6. Print true, if sum of squares of any 2 numbers is a 3rd given number
public class M6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		System.out.println("enter third number");
		int c = sc.nextInt();
		sc.close();
		boolean flag = false;
		int sqrOfa = a * a;
		int sqrOfb = b * b;
		int sqrOfc = c * c;
		if(a == sqrOfb + sqrOfc)
		{
			flag = true;
		}
		if(b == sqrOfa + sqrOfc)
		{
			flag = true;
		}
		if(c == sqrOfb + sqrOfa)
		{
			flag = true;
		}
		System.out.println(flag);
	}
}
