#include<stdio.h>
int distance(int x1,int y2)
{
	int d=(x1*x1)+(y2*y2);
	return d;
}
int distanced(int x1,int x2)
{
	int d = (x2-x1)*(x2-x1);
	return d;
}
int main()
{
	int v,n,m,c=0;
	int i,j,k,p,q,r,s,t,u;
	scanf("%d",&v);
	for( i=0;i<v;i++)
	{
	    c=0;
		scanf("%d",&n);
		scanf("%d",&m);
		int x[n],y[m];
		for( j=0;j<n;j++)
		{
			scanf("%d ",&x[j]);
		}
		for( k=0;k<m;k++)
		{
			scanf("%d",&y[k]);
		}
		for( p=0;p<n;p++)
		{
			for( q=p+1;q<n;q++)
			{
				for( t=0;t<m;t++)
				{
					int s1=distanced(x[q],x[p]);
					int s2=distance(x[q],y[t]);
					int s3=distance(x[p],y[t]);
					if(s1==s2+s3 || s2==s1+s3 || s3==s1+s2)
					{
						c++;
						
					}
				}
			}
		}	
		for( r=0;r<m;r++)
		{
			for( s=r+1;s<m;s++)
			{
				for(u=0;u<n;u++)
				{
					int s1=distanced(y[s],y[r]);
					int s2=distance(y[s],x[u]);
					int s3=distance(y[r],x[u]);
					if(s1==s2+s3 || s2==s1+s3 || s3==s1+s2)
					{
						c++;
						
					}
				}	
			}
		}
        printf("%d\n",c);	
	}
}
