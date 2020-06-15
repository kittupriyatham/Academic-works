package package1;

public class Skilling12_1 
{
	public static void divisible(int n)
	{
		if((n%3)==0 && (n%7)==0)
		{
			System.out.println("DIVISIBLE BY BOTH");
		}
		else if(((n%3)==0 && (n%7)!=0)||((n%3)!=0 && (n%7)==0))
		{
			System.out.println("DIVISIBLE BY ONLY ONE");
		}
		else if(((n%3)!=0 && (n%7)!=0))
		{
			System.out.println("NOT DIVISIBLE BY BOTH");
		}
	}
}
