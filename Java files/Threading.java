
public class Threading extends Thread implements Runnable
{
public void run()
{
	for(int i=1;i<=5;i++)
	{
		System.out.println(i);
		System.out.println(Thread.currentThread().getName());
	}
}
}
