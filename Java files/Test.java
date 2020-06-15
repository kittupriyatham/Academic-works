package eleven;
import java.util.Scanner;
public class Test extends B 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int a=sc.nextInt();
		int b = sc.nextInt();
		System.out.println(sum(a,b));
		System.out.println(sub(a,b));
	}

}
