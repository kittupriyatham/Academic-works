package Package1;
import java.util.*;
public class Linearsearchexample {
	
	int key,i;
	  public static void  Linearsearch(int n,int a[],int key) {
		 for(int i=0;i<n;i++)
		 {
			 if(key==a[i])
			 {
				 System.out.println("found at "+i);
				 break;
			 }
		 }
		  
		  		  
		
	}
	  public static void main (String args[])
	  {
		Scanner sc=  new Scanner(System.in);
		int n=sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		
		}
		
System.out.println("enter the key value");
int key=sc.nextInt();
Linearsearch(n,a,key);
		}
	  }

