package seven;
import java.util.ArrayList;
import java.util.Scanner;
public class arraylists {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	ArrayList<String> al1=new ArrayList<String>();
   al1.add("pen");
   al1.add("paper");
   al1.add("pencil");
   	ArrayList<String> al2 = new ArrayList<String>();
   	al2.add("eraser");
   	al2.add("pen");
   	al2.add("book");
   	System.out.println("enter your choice");
   	int ch = sc.nextInt();
   	switch (ch)
   	{
   	case 1: al2.addAll(al1);
   	System.out.println(al2);
   		break;
   	case 2: al2.retainAll(al1);
   	System.out.println(al2);
   		break;
   	case 3: al2.removeAll(al1);
   	System.out.println(al2);
   		break;
   	}
   	}
}