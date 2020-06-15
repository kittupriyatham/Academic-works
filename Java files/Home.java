import java.util.HashMap;
public class Home 
{
	public static void main(String args[]) 
	{
		HashMap <String , Integer> hm = new HashMap<String,Integer>();
		hm.put("krishna",99);
		hm.put("kittu", 100);
		System.out.println(hm.get("kittu"));
	}
}
