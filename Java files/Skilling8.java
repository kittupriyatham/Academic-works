package package1;
import java.util.Scanner;
public class Skilling8 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a+b>c&&a+c>b&&c+b>a)
		{
			System.out.println("YES");
			int perimeter = a+b+c;
			System.out.println(perimeter);
		}
		else 
		{
			System.out.println("NO");

		}
	}
}