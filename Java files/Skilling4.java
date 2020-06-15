package package1;
import java.lang.Math;
public class Skilling4 
{
	public static double area(double r)
	{
		double area;
		area = (Math.PI)*r*r;
		return area;
	}
	public static double perimeter(double r)
	{
		double perimeter;
		perimeter = 2*(Math.PI)*r;
		return perimeter;
	}
	public static void main(String args[])
	{
	double r = 3.7;
	System.out.println(perimeter(r));
	System.out.println(area(r));
	}
}
