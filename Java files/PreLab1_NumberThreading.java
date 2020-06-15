package eleven;

public class PreLab1_NumberThreading extends Thread implements Runnable
{
	int n;
	public PreLab1_NumberThreading(int n)
	{
		this.n=n;
		run();
	}
	public void run()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("thread  "+Thread.currentThread().getName());
			System.out.println(i);
		}
	}
}
