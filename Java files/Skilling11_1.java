package package1;

public class Skilling11_1 
{
	public static void Indicator(int v)
	{
		if(v>=60)
		{
			System.out.println(v);
			System.out.println("!!!!!OVER SPEED!!!!!");
		}
		else if(v>=40 && v<60)
		{
			System.out.println(v);
			System.out.println("AVERAGE SPEED");
		}
		else
		{
			System.out.println(v);
			System.out.println("SAFE DRIVE");
		}
	}
}
