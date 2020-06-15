package Package1;
import java.util.*;
public class TestClass
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int key = sc.nextInt();
		int a[]= new int[n];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int flag=0;
		int index=0;
		for(int j=0;j<a.length;j++)
		{
		if(a[j]==key)
		{
			flag=1;
			index=j;
		}
		}
		if(flag==1)
		{
			System.out.println(index+1);
		}
		else
		{
			System.out.println(-1);
		}
			
	}

}
