package Package1;
import java.util.Scanner;
public class SLLDemo 
{
	public static void main(String args[]) 
	{
		SLL  ob=new SLL ();
		Scanner sc=new Scanner(System.in);
		while(true) 
		{
			System.out.println("1.create 2.display 3.exit");	
			int choice=sc.nextInt();
			switch(choice) 
			{
				case 1:System.out.println("enter the value");
					int val=sc.nextInt();
					ob.create(val);
					break;
				case 2:System.out.println("elements of sll");
					ob.Display();
					break;
				case 3:
					System.exit(0);
			}
		}
	}
}