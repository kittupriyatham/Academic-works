import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysSort {
public static void main(String args[]) throws FileNotFoundException
{
int c=0;
File f=new File("D:\\eclipse\\New Eclipse\\Lab\\src\\reverse.txt");
Scanner s=new Scanner(f);
String a[]=new String[100];
while(s.hasNext())
{
a[c++]=s.next();
}
 Arrays.sort(a,0,c);
 for(int i=0;i<c;i++)
 System.out.println(a[i]);
}
}
