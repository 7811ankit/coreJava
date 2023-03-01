package number_sys_pdf;
import java.util.Scanner;
//9. Print all odd numbers between two given numbers?
public class M9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		sc.close();
		for(int i = a; i <= b; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(i + ", ");
			}
		}
	}
}
