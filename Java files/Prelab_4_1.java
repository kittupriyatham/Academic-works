package test2;
public class Prelab_4_1
{
   private int value;
    public Prelab_4_1(int val)
    {
        value = val;

    }
    public int getX()
    {
        return value;
    }
    public static boolean isEven(int value)
    {
        if(value%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean isOdd(int value)
    {
        if(value%2!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean isPrime(int value)
    {
        int c=0;
        for(int i=1;i<value;i++)
        {
            if(value%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isEven()
    {
        if(value%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isOdd()
    {
        if(value%2!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isPrime()
    {
        int c=0;
        for(int i=1;i<value;i++)
        {
            if(value%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean isEven(Prelab_4_1 ob)
    {
        if(ob.value%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean isOdd(Prelab_4_1 ob)
    {
        if(ob.value%2!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean isPrime(Prelab_4_1 ob)
    {
        int c=0;
        for(int i=1;i<ob.value;i++)
        {
            if(ob.value%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean equals(int num)
    {
        if(value==num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public  boolean equals(Prelab_4_1 ob)
    {
        if(this.value==ob.value)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int parseint(char[] a)
    {
        String s ="";
        for (int i=0;i<a.length;i++)
        {
            s = s+Character.toString(a[i]);
        }
        int d =  Integer.parseInt(s);
        return d;
    }
    public static int parseint(String s)
    {
        int f = Integer.parseInt(s);
        return f;
    }
}
