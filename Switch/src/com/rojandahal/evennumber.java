package com.rojandahal;

public class evennumber {
    public static void main (String[] args)
    {
        for (int i=4;i<=20;i++) {
            while (isEvenNumber(i))
            {
                System.out.println("Even number: "+ i);
                break;
            }
        }
    }
    public static boolean isEvenNumber(int n)
    {
        if (n%2==0)
            return true;
        else return false;
    }


}
