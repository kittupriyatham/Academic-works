
public class MyThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println("thread name = "+Thread.currentThread().getName());
			System.out.println(i);
		}
	}
}
