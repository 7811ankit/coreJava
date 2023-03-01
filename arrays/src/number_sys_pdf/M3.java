package number_sys_pdf;
import java.util.Scanner;
//3. Print middle number from 3 given numbers
public class M3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		System.out.println("enter third number");
		int c = sc.nextInt();
		sc.close();
		if(a < b && b < c)
		{
			System.out.println(b + " is a middle number");
		}
		if(a < c && c < b)
		{
			System.out.println(c + " is a middle number");
		}
		if(a > c && a < b)
		{
			System.out.println(a + " is a middle number");
		}
	}
}
//a = 100, b = 200, c = 300
//a = 100, b = 300, c = 200
//a = 200, b = 300, c = 100