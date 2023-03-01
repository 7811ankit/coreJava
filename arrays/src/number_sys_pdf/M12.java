package number_sys_pdf;
import java.util.Scanner;
//12. Find out whether digits are in raising order or not in a given numer?
public class M12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int num = sc.nextInt();//1234
		sc.close();
		int flag = 0;
		int count = 0;
		while(num != 0)
		{
			flag++;
			int p = num % 10;
			num = num / 10;
			int q = num % 10;
			if(p >= q)
			{
				count++;
			}
		}
		if(count == flag)
		{
			System.out.println("digits are in raising order");
		}
		else
		{
			System.out.println("digits are not in raising order");
		}
	}
}
