package test2;

public class Hr extends Employee
{
	private int salary;
	private String performance;
	public void setDetails(int e,String n,int s,String p)
	{
		setValues(e,n);
		salary=s;
		performance=p;
	}
	public void displayConfidentialDetails()
	{
		System.out.println("SALARY="+salary+"PERFORMANCE="+performance);
	}
}
