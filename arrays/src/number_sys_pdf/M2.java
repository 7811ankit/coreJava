package number_sys_pdf;
//2. Print smaller number from 3 given numbers
import java.util.Scanner;
public class M2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		System.out.println("enter third number");
		int c = sc.nextInt();
		sc.close();
		if(a > b && a > c)
		{
			System.out.println(a  + " is bigger");
		}
		if(b > a && b > c)
		{
			System.out.println(b + " is bigger");
		}
		if(c > a && c > b)
		{
			System.out.println(c + " is bigger");
		}
	}
}
//a = 10, b = 20, c = 15
//a = 20, b = 10, c = 15
//a = 10, b = 15, c = 20