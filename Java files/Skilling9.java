package package1;
import java.util.Scanner;
public class Skilling9 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int y;
		y=sc.nextInt();
		if((y%4)==0 && (y%100)!=0)
		{
			System.out.println("YES");
		}
		else if(y%400==0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

}
