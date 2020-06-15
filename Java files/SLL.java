package Package1;

public class SLL {
SLLNode head=null,tail=null;
public void create(int val)
{
	SLLNode newnode=new SLLNode();
	newnode.data=val;
	newnode.next=null;
	if(head==null) {
		head=tail=newnode;
	}
	else {
		newnode.next=tail;
		tail=newnode;
	}
	}
	public  void  Display()
	{
	
	
		if(head==null)
			System.out.println("NO SLL");
		else
		{
			SLLNode c =head;
			while(c!=null) {
				System.out.println(c.data+"->");
				c=c.next;
			}
		}
	
}
}
