package seven;

public class Prelab1_Rectangle extends Prelab1_GeometricObject
{
	private double length;
	private double breadth;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public String toString()
	{
		return "length = "+getLength()+" breadth = "+getBreadth()+" fill colour = "+getFill_color()+" border colour = "+getBorder_color()+" border width = "+getBorder_width()+" fill = "+isFill();
	}
}
