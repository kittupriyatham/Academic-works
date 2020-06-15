import java.util.Scanner;
public class RangedPrimes 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(i);
				System.out.println();
			}
			else
			{
				
				System.out.println("wrong numbers");
			}
		}
	}

}
