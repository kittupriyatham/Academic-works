package seven;

public class Prelab1_Demo 
{
	public static void main(String[] args) 
	{
		Prelab1_Rectangle r = new Prelab1_Rectangle();
		Prelab1_Circle c = new Prelab1_Circle();
		r.setLength(10);
		r.setBreadth(5);
		r.setBorder_color("black");
		r.setFill_color("red");
		r.setBorder_width(1);
		r.setFill(true);
		
		
		c.setRadius(5);
		c.setBorder_color("black");
		c.setFill_color(null);
		c.setBorder_width(1);
		c.setFill(false);
		
		
		System.out.println(r.toString());
		System.out.println(c.toString());
	}

}
