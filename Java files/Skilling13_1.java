package package1;
import java.lang.Math;
public class Skilling13_1 
{
	private int r;

	public int getR() 
	{
		return r;
	}

	public void setR(int r) 
	{
		this.r = r;
	}
	public int circumference(int r)
	{
		return ((int)(2*(Math.PI)*r));
	}
	public int area(int r)
	{
		return ((int)(r*(Math.PI)*r));
	}
	
}
