package Package1;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack_LinkedList ob = new Stack_LinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		
		StringBuffer s = new StringBuffer(sc.nextLine());
		StringBuffer s1 = new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			ob.push(s.charAt(i));
		}
		for(int j=0;j<s.length();j++)
		{
			s1.append(ob.pop());
		}
		System.out.println(s1);
	}
}