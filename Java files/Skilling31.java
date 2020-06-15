package package1;
import java.util.Scanner;
public class Skilling31 {
   public static void main(String args[])
   {
	   int num=0;
       Scanner sc=new Scanner(System.in);
       int m=sc.nextInt();
       int n=sc.nextInt();
       for(int i=n;i<=m;i++)
       {
            int c=0;
            for(num=i;num>=1;num--)
            {
                if(i%num==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.println(i);
            }
           
     }  }
}