package package1;
import java.util.Scanner;
public class Skilling2 
{
	public static void main(String args[])
	{
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	System.out.println("max = "  +((a>b && a>c)?a:((b>c)?b:c)));
	System.out.println("min = "+((a<b && a<c)?a:((b<c)?b:c)));
	sc.close();
	}
}