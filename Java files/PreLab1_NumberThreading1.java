package eleven;
import java.util.*;
public class PreLab1_NumberThreading1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++)
		{
		PreLab1_NumberThreading ob1 = new PreLab1_NumberThreading(n);
		Thread t1 = new Thread(ob1);
		t1.start();
		PreLab1_NumberThreading ob2 = new PreLab1_NumberThreading(n);
		Thread t2 = new Thread(ob2);
		t2.start();
		PreLab1_NumberThreading ob3 = new PreLab1_NumberThreading(n);
		Thread t3 = new Thread(ob3);
		t3.start();
		}
	}

}
