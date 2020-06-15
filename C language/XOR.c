#include<stdio.h>
unsigned int countSetBits(unsigned int n);
int main()
{
	int t,i,j,k,l;
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{
		int n,q;
		scanf("%d %d",&n,&q);
		int a[n];
		unsigned int a1[n];
		for(j=0;j<n;j++)
		{
			scanf("%d",&a[j]);
			a1[j]=((countSetBits((unsigned int)a[j]))%2==0)?0:1;
		}
		while(q>0)
		{
			int p;
			scanf("%d",&p);
			int r=((countSetBits((unsigned int)p))%2==0)?0:1;
			int ec=0,oc=0;
			for(l=0;l<n;l++)
			{
				if(a1[l]==r)
				    ec++;
				else if(a1[l]!=r)
				    oc++;
			}
			printf("%d %d",ec,oc);
			printf("\n");
			q--;
		}
	}
}
unsigned int countSetBits(unsigned int num) 
{
	int num_to_bits[16] = { 0, 1, 1, 2, 1, 2, 2, 3,1, 2, 2, 3, 2, 3, 3, 4 }; 
    int nibble = 0; 
    if (0 == num) 
        return num_to_bits[0]; 
  
    // Find last nibble 
    nibble = num & 0xf; 
  
    // Use pre-stored values to find count 
    // in last nibble plus recursively add 
    // remaining nibbles. 
    return num_to_bits[nibble] + countSetBits(num >> 4); 
}
/*
1
6 1
4 2 15 9 8 8
3
*/
