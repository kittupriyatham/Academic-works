#include<stdio.h>
int main ()
{
int a[100], n,i,num,pos,found;
    printf("Enter number of elements in array\n");
  
   scanf("%d", &n);
   
  printf("Enter %d elements\n", n);
  
  
   for (i=0;i<n;i++)
   
      scanf("%d", &a[i]);
    
	  printf("Enter the number to be searched\n");
    scanf("%d",&num);
    for (i=0;i<n;i++)
    {
    	if(a[i]==num)
    	{
    		found=1;
    		pos=i;
    		printf("%d is found in array at position %d\n",num,i);
    		break;
		}
	}
	if (found==0)
	{
		printf("%d doesnt exist in array\n",num);
		return 0;      
}
}
