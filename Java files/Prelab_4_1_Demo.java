package test2;
public class Prelab_4_1_Demo
{
    public static void main(String args[])
    {
        Prelab_4_1 mi=new Prelab_4_1(50);
        System.out.println(mi.getX());
//calling instance methods
        System.out.println(mi.isEven());
        System.out.println(mi.isOdd());
        System.out.println(mi.isPrime());
        System.out.println();
//Calling static methods
        System.out.println(Prelab_4_1.isEven(43));
        System.out.println(Prelab_4_1.isOdd(43));
        System.out.println(Prelab_4_1.isPrime(43));
        System.out.println();
//Calling the overloaded static methods-Object as argument
        System.out.println(Prelab_4_1.isEven(mi));
        System.out.println(Prelab_4_1.isOdd(mi));
        System.out.println(Prelab_4_1.isPrime(mi));
        System.out.println();
//Calling equals
        System.out.println(mi.equals(50));
        System.out.println();
//Calling overloaded equals() method-Object as argument
        Prelab_4_1 mig=new Prelab_4_1(26);
        System.out.println(mi.equals(mig));
        System.out.println();
//Calling parseInt methods
        char a[]= {'1','2','5'};
        System.out.println(Prelab_4_1.parseint(a));
        System.out.println(Prelab_4_1.parseint("321"));
    }
}
