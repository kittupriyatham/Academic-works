import java.util.Scanner;
public class Prelab2 {
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a String");
String s1=s.next();
while(true)
{
int ch;
System.out.println("***MENU***");
System.out.println("1.charAt()");
System.out.println("2.length()");
System.out.println("3.indexOf(char c)");
System.out.println("4.indexOf(char c,int fromIndex)");
System.out.println("5.indexOf(String a)");
System.out.println("6.indexOf(String a,int fromIndex)");
System.out.println("7.lastIndexOf(char a)");
System.out.println("8.lastIndexOf(char a,int fromIndex)");
System.out.println("9.lastIndexOf(String a)");
System.out.println("10.lastIndexOf(String a,int fromIndex)");
System.out.println("11.substring(int beginIndex)");
System.out.println("12.substring(int beginIndex,int endIndex)");
System.out.println("13.valueOf(boolean b)");
System.out.println("14.valueOf(char c)");
System.out.println("15.valueOf(char[] data)");
System.out.println("16.valueOf(double d)");
System.out.println("17.valueOf(int i)");
System.out.println("18.Exit");
System.out.println("Enter your choice");
ch=s.nextInt();
int index,b,e;
String s2;
switch(ch)
{
case 1:System.out.println("Enter Index");
index=s.nextInt();
System.out.println(s1.charAt(index));
break;
case 2:System.out.println(s1.length());
break;
case 3:System.out.println("Enter char");
s2=s.next();
System.out.println(s1.indexOf(s2.charAt(0)));
break;
case 4:System.out.println("Enter char");
s2=s.next();
System.out.println("Enter fromIndex");
b=s.nextInt();
System.out.println(s1.indexOf(s2.charAt(0),b));
break;
case 5:System.out.println("Enter String");
s2=s.next();
System.out.println(s1.indexOf(s2));
break;
case 6:System.out.println("Enter String");
s2=s.next();
System.out.println("Enter fromIndex");
b=s.nextInt();
System.out.println(s1.indexOf(s2,b));
break;
case 7:System.out.println("Enter char");
s2=s.next();
System.out.println(s1.lastIndexOf(s2.charAt(0)));
break;
case 8:System.out.println("Enter Char");
s2=s.next();
System.out.println("Enter fromIndex");
b=s.nextInt();
System.out.println(s1.lastIndexOf(s2.charAt(0),b));
break;
case 9:System.out.println("Enter String");
s2=s.next();
System.out.println(s1.lastIndexOf(s2));
break;
case 10:System.out.println("Enter String");
s2=s.next();
System.out.println("Enter fromIndex");
b=s.nextInt();
System.out.println(s1.lastIndexOf(s2,b));
break;
case 11:System.out.println("Enter beginIndex");
b=s.nextInt();
System.out.println(s1.substring(b));
break;
case 12:System.out.println("Enter beginIndex");
b=s.nextInt();
System.out.println("Enter endIndex");
e=s.nextInt();
System.out.println(s1.substring(b,e));
break;
case 13:System.out.println("Enter boolean value");
boolean b1=s.nextBoolean();
System.out.println(String.valueOf(b1));
break;
case 14:System.out.println("Enter Character");
s2=s.next();
System.out.println(String.valueOf(s2.charAt(0)));
break;
case 15:System.out.println("Enter Char array");
char a[]= {'a','e','i','o','u'};
System.out.println(String.valueOf(a));
break;
case 16:System.out.println("Enter double value");
double d=s.nextDouble();
System.out.println(String.valueOf(d));
break;
case 17:System.out.println("Enter int value");
int i=s.nextInt();
System.out.println(String.valueOf(i));
break;
case 18:System.exit(0);
default:System.out.println("Invalid Choice");
}
}
}
}