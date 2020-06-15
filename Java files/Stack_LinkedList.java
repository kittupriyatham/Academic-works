package Package1;

public class Stack_LinkedList 
{
	SLLNode top = null;
	
	
	public void push(char val)
	{
		SLLNode newnode = new SLLNode();
		newnode.data=val;
		newnode.next=null;
		if(top==null)
			top=newnode;
		else
		{
			newnode.next=top;
			top=newnode;
		}
	}
	
	
	public char pop()
	{
		char temp=(char)top.data;
		top=top.next;
		return temp;
	}
	
}
