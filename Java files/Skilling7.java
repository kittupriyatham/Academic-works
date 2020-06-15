package package1;

public class Skilling7 
{
	public static void main(String[] args) 
	{
		double d,p,r,t=6;
		d=100;p=100;r=0.05/12;
		double ci = 0;
		for(int i=1;i<=6;i++)
		{
			ci=p*(1+r);
			p=ci+d;
			System.out.println(ci);
			
		}
		System.out.println();
		System.out.println();
		System.out.println(ci);
	}

}
