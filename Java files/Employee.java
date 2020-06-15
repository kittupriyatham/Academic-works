package test2;

public abstract class Employee 
{
	private int id;
	private String name;
	public void setValues(int i,String n)
	{
		id=i;
		name=n;
	}
	public void display()
	{
		System.out.println("ID="+id+"NAME="+name);
	}
	public abstract void displayConfidentialDetails();
}
