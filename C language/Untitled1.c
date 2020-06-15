#include <stdio.h>
int factorial(int x);
int main()
{
	int n,f;
	printf("enter a number\n");
	scanf("%d", &n);
	f=factorial(n);
	printf("%d",f);
}
int factorial(int x)
{
    int f=1,i;
    for (i=1;i<=x;i++)
    {
        f=f*i;
    }
    return f;
}
