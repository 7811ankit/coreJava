package number_sys_pdf;
import java.util.Scanner;
//1. Print bigger number from 2 given numbers.
public class M1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int number1 = sc.nextInt();
		System.out.println("enter second number");
		int number2 = sc.nextInt();
		System.out.println("the bigger number is : ");
		System.out.println(number1 > number2 ? number1 : number2);
		sc.close();
	}
}

