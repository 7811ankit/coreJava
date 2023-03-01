package number_sys_pdf;
import java.util.Scanner;
//8. Find out immediate next 5 multiple of a given number?
public class M8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int num = sc.nextInt();
		sc.close();
		int count = 1;
		while(count != 6)
		{
			int multiple =  num * count++;
			System.out.println(multiple);
		}
	}
}
