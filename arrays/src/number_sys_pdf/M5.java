package number_sys_pdf;
//5. Print true, if sum of any 2 numbers is a 3rd given number
import java.util.Scanner;
public class M5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		System.out.println("enter third number");
		int c = sc.nextInt();
		sc.close();
		boolean flag = ((c == a + b) || (b == a + c) || (a == b + c) ? true : false); 
		System.out.println(flag);
	}
	
}
