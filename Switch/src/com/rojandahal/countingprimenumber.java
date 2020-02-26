package com.rojandahal;

public class countingprimenumber {
    public static void main (String[] args)
    {
        int count=0;
        for (int i=2;i<999;i++)
        {
            if (isPrime(i))
            {
                System.out.println("Prime number is: "+ i);
                count++;
            }
            if (count==10) {
                System.out.println("Exiting loop");
                break;
            }
        }
    }
    public static boolean isPrime (int i)
    {
        int prime=0;
        for (int j=2;j<=i;j++)
        {
            if (i%j==0) {
                prime++;
                continue;
            }
        }

        if (prime>1)
            return false;
        else
        {
            return true;
        }
    }
}
