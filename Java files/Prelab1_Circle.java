package seven;

public class Prelab1_Circle extends Prelab1_GeometricObject
{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String toString()
	{
		return "radius = "+getRadius()+" fill colour = "+getFill_color()+" border colour = "+getBorder_color()+" border width = "+getBorder_width()+" fill = "+isFill();
	}
}
