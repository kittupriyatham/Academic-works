package package1;
import java.util.Scanner;
public class Skilling13_2 
{

	public static void main(String[] args) 
	{
		Skilling13_1 ob = new Skilling13_1();
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		ob.setR(r);
		System.out.println(ob.getR());
		System.out.println(ob.area(r));
		System.out.println(ob.circumference(r));
	}

}
