package com.rojandahal;

public class forloop {
    public static void main (String[] args)
    {
        for (int i=2; i<=8; i++)
        {
            System.out.println("Interest rate of 10000 with "+ i+ " interest rate is = "+ String.format("%.2f",calculateInterest(10000,i)));
        }
    }

    public static double calculateInterest(double p, double r)
    {
        return (p*(r/100));
    }



}
