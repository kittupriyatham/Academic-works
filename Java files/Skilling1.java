package package1;
import java.util.Scanner;
public class Skilling1 
{
    public static void main(String[] args) 
    { 
    	Scanner sc  = new Scanner(System.in);
    	System.out.println("enter x");
        int x = sc.nextInt(); 
        System.out.println("enter y");
        int y = sc.nextInt(); 
        System.out.println("BEFORE swaping:"
                + " x = " + x + ", y = " + y); 
        // Code to swap 'x' and 'y' 
        x = x * y;
        System.out.println("WHILE swaping:"
                + " x = " + x + ", y = " + y); // x now becomes 50 
        y = x / y; // y becomes 10 
        System.out.println("WHILE swaping:"
                + " x = " + x + ", y = " + y); 
        x = x / y; // x becomes 5 
  
        System.out.println("After swaping:"
                           + " x = " + x + ", y = " + y); 
    } 

}
