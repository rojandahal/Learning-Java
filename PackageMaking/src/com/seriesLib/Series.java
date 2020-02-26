package com.seriesLib;

public class Series {

    //This function will return the sum of numbers from 0 to n when n is passed as a parameter
    public int nSum(int n)
    {
        int sum=0;
        for (int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    //This function will return nth fibonacci number when nth position is passed
    public int fibonacci(int n){
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);   //Recursively calls the fibonacci function to return the n-1 + n-2 value
    }
    public int factorial(int n){
            if (n==1)
                return 1;
            if (n==0)
                return 1;
            return n*factorial(n-1);
    }
}
