package Package1;

public class DLL 
{
	DLLNode head;
	DLLNode tail;
	@SuppressWarnings("unused")
	public void insertAtEnd(int val)
	{
		DLLNode newnode = new DLLNode();
		newnode.data = val;
		newnode.next=null; 
		newnode.previous=null;
		head=null;
		tail=null;
		if(head==null)
		{
			head=tail=newnode;
		}
		else
		{
			newnode.previous=tail;
			tail.next=newnode;
			tail=newnode;
		}
	}
	public void display()
	{
		if(head==null)
		{
			System.out.println("NO DLL");
		}
		else
		{
			DLLNode c=head;
			while(c!=null)
			{
				System.out.println(c.data+" -> ");
				c=c.next;
			}
			System.out.println();
		}
	}
	public void insertAtBeginning(int val)
	{
		DLLNode newnode = new DLLNode();
		newnode.data=val;
		newnode.previous=null;
		newnode.next=null;
		newnode.next=head;
		head.previous=newnode;
		head=newnode;
	}
	public void insertAtMiddle(int val,int pos)
	{
		DLLNode c=head;
		for(int i=1;i<pos-1;i++)
			c=c.next;
		c.next=c.next.next;
		c.next.previous=c;
	}
	public void deleteAtEnd()
	{
		tail=tail.previous;
		tail.next=null;
	}
	public void deleteAtBeginning()
	{
		head=head.next;
		head.previous=null;
	}
	public void deleteAtMiddle(int pos)
	{
		DLLNode c=head;
		for(int i=1;i<pos-1;i++)
			c=c.next;
		c.next=c.next.next;
		c.next.previous=c;
	}
}