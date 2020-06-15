package package1;
import java.util.Scanner;
public class Skilling14_2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Skilling14_1 ob = new Skilling14_1();
		long id = sc.nextLong();
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		ob.setId(id);
		ob.setM1(m1);
		ob.setM2(m2);
		ob.setM3(m3);
		ob.setM4(m4);
		ob.setM5(m5);
		System.out.println(ob.getId());
		System.out.println(ob.getM1());
		System.out.println(ob.getM2());
		System.out.println(ob.getM3());
		System.out.println(ob.getM4());
		System.out.println(ob.getM5());
		System.out.println(ob.total());
		System.out.println(ob.average());
	}

}
