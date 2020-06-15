package TreeDataStructure;

public class BSTOperations 
{
	BSTNode root=null;
	boolean Search(int key,BSTNode root)
	{
		if(root.data==key)
			return true;
		else if (root.data<key)
			Search(key,root.left);
		else if (root.data>key)
			Search(key,root.right);
		return false;
	}
	BSTNode Insert(int key,BSTNode root)
	{
		BSTNode newnode = new BSTNode();
		if(root==null)
		{
			newnode.left=null;
			newnode.right=null;
			newnode.data=key;
			root=newnode;
		}
		else if(key<root.data)
		{
			root.left= Insert(key,root.left);
			newnode=root;
		}
		else if(key>root.data)
		{
			root.right = Insert(key,root.right);
			newnode=root;
		}
			return newnode;
	}
	
	
	
}
