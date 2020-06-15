import java.util.LinkedList;
import java.util.Collections;
public class LinkedListsExample 
{
	public static void main(String args[])
	{
		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.add("kittu");
		ll1.add("hemanth");
		ll1.add("rishi");
		ll1.add("akhil");
		System.out.println(ll1);
		ll1.addFirst("190050110");
		ll1.add(2, "190031616");
		ll1.add(4, "190031992");
		ll1.add(6, "190030934");
		System.out.println(ll1);
		ll1.add("10");
		System.out.println(ll1);
		Collections.sort(ll1);
			System.out.println(ll1);
	}
}