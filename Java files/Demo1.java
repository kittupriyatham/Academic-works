package test2;

public class Demo1 {

	public static void main(String[] args) 
	{
		Hr ob = new Hr();
		ob.setDetails(1, "kittu", 120000, "GOOD");
		ob.display();
		ob.displayConfidentialDetails();
	}

}
