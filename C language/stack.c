#include<stdio.h>
int c,max,stack[],data,top==-1,i;
int main()
{
int push (int stack[max],int data);
int pop (int stack[max]);
void display();
void peek();

printf("enter your choice:\n");
printf("1.push:\n");
printf("2.pop:\n");
printf("3.display:\n");
printf("4.peek:\n");
scanf("%d",&c);
switch (c)
{
case 1: push(stack[max],data);
 break;
case 2: pop(stack[max]);
break;
case 3: display();
break;
case 4: peek();	
break;
}
}
int push (int stack[max],int data)
{
if(top==-1)
printf("stack is empty");
else{
top++;
stack[top]=data;
}
return data;
}
int pop (int stack[max])
{
int data;
if(top==-1)
printf("stack is empty");
else
{
data=stack[top];
top--;
}
return data;
}
void display()
{
	for(i=top;i>=0;i--)
	printf("%d",stack[top]);
}
void peek()
{
	if(top==-1)
	{
		printf("empty\n");
	}
	else
	{
		printf("%d",stack[top]);
	}
}
