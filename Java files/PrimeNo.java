package eleven;

public class PrimeNo implements Runnable{
Thread  t;
int n;
PrimeNo(String Name, int n )
{
	t=new  Thread(this,Name);
	this.n=n;
	
}
@Override
public void run() {
	// TODO Auto-generated method stub
	
}
}
