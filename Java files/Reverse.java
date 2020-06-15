import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Reverse {
public static void main(String args[]) throws FileNotFoundException
{
File f=new File("D:\\eclipse\\New Eclipse\\Lab\\src\\reverse.txt");
Scanner s=new Scanner(f);
String s1=new String("");
while(s.hasNext())
{
s1=s.next();
StringBuffer s2=new StringBuffer(s1);
s2.reverse();
System.out.print(s2+" ");
}
s.close();
}
}