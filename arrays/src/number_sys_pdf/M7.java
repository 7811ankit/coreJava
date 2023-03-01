package number_sys_pdf;
import java.util.Scanner;
//7. Find out given number is an even or odd?
public class M7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int a = sc.nextInt();
		sc.close();
		System.out.println(a % 2 == 0 ? "even" : "odd");
	}
}
