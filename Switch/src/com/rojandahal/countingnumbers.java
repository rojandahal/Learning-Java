package com.rojandahal;

public class countingnumbers {
    public static void main (String[] args)
    {
        int sum=0,count=0;
        for (int i=1;i<1000;i++)
        {
            if (i%3==0 && i%5==0)
            {
                System.out.println("Num: "+ i);
                sum+=i;
                count++;
            }
            if (count==5)
                break;
        }
        System.out.println("Sum of numbers is: "+ sum);
    }

}
