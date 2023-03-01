package number_sys_pdf;
import java.util.Scanner;
//10. Find out sum of all even numbers between two given numbers?
public class M10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		sc.close();
		int sum = 0;
		for(int i = a; i <= b; i++)
		{
			if(i % 2 == 0)
			{
				 sum = sum + i; 
			}
		}
		System.out.println(sum);
	}
}
