package com.rojandahal;

public class returnsumDigit {
    public static void main(String[] args) {
        System.out.println("Sum of digit = "+ sumDigit(125));
    }
    public static int sumDigit(int n)
    {
        int sum=0;
        if (n<=9)
            return -1;
        while (n!=0) {
            sum+=n % 10;
            n = n / 10;
        }
        return sum;

    }
}
