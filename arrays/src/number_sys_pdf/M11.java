package number_sys_pdf;
import java.util.Scanner;
/*11. Print java for multiples of 4 and print j2ee for multiples of 5 and if 
number is multiple of 4 and also 5, then print lara. Continue till to 100	*/
public class M11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		sc.close();
		for(int i = a; i <= b; i++)
		{
			if(i % 4 == 0)
			{
				System.out.println(i + " :is multiple of 4 hence print  =  java");
			}
			else if(i % 5 == 0)
			{
				System.out.println(i + " :is multiple of 5 hence print  =  j2ee");
			}
			else
			{
				System.out.println(i + " :is nither multiple of 4 nor 5 hence print  =  lara");
			}
			
		}
	}
}
