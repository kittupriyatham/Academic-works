package package1;
import java.util.Scanner;
public class Skilling6 
{
	public static void main(String a[])
  	{
	long id;
	int m1,m2,m3,m4;
	int total,avg;
	Scanner sc = new Scanner(System.in);
	id = sc.nextLong();
	m1 = sc.nextInt();
	m2 = sc.nextInt();
	m3 = sc.nextInt();
	m4 = sc.nextInt();
	total = m1+m2+m3+m4;
	avg = total/4;
	System.out.println(id);
	System.out.println(avg);
	System.out.println(total);
	}
}