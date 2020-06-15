package test2;
import java.util.Scanner;
public class Prime 
{
	public static boolean isPrime(int x)
	{
		int count =0;
		for(int i=1;i<=x;i++)
		{
			if(x%i!=0)
			{
				count++;
			}
			System.out.println("count is"+count);
		}
		System.out.println();
		if(count==2)
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	public static void primeRange(int m,int n)
	{
		for(int i=m;i<=n;i++)
		{
			boolean f;
			f = isPrime(i);
			if(f==true)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) 
	{
		int m,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		m=sc.nextInt();
		System.out.println("enter another number");
		n=sc.nextInt();
		primeRange(m,n);
		
	}

}
