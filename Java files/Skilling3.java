package package1;
import java.util.Scanner;
public class Skilling3 
{
	public static void main(String args[])
	{
	int n,m;
	int c=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first number");
	m = sc.nextInt();
	System.out.println("enter second number");
	n = sc.nextInt();
	for(int i=m;i<=n;i++) 
	{
			for (int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				 System.out.println(i);
			}
	}
	}
}