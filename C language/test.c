#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    int n;
    scanf("%d",&n);
    int p;
    scanf("%d",p);
    long long int binary = convert_to_binary(n);
    long long int binary_converted = changed_binary(binary,p);
    int decimal = convert_to_decimal(binary_converted);
    printf("%d",decimal);
    return 0;
}
long long int convert_to_binary(int n) 
{
    long long int bin = 0;
    long long int rem, i = 1, step = 1;
    while (n != 0) 
	{
        rem = n % 2;
        n /= 2;
        bin += rem * i;
        i *= 10;
    }
    return bin; 
}
int convert_to_decimal(long long int b) 
{
    int dec = 0, i = 0, rem;
    while (b != 0) 
    {
        rem = b % 10;
        b /= 10;
        dec += rem * pow(2, i);
        ++i;
    }
    return dec;
}
long long int changed_binary(long long int b1,int index)
{
    long long int t0 = b1%((long long int)pow(10,index));
    long long int t1 = t0/((long long int)pow(10,index-1));
    t1=(long long int)0;
    long long int t2 = b1/((long long int)pow(10,index));
    long long int t3 =((long long int)(t2*10))+t1;
    long long int t4 = b1%((long long int)pow(10,index));
    long long int t5 = (t3*((long long int)pow(10,index)))+t4;
    return t5;
}
