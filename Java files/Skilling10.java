package package1;
import java.util.Scanner;
public class Skilling10 
{

	public static int sum(int n)
		{
			int tsum=0;
			for(int i=0;i<=n;i++)
			{
				tsum = tsum+i;
			}
			return tsum;
		}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		System.out.println(sum(num));
		sc.close();
	}

}
