package com.rojan;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[] element;
        int count;
        System.out.println("Enter the number of elements: ");
        count = scan.nextInt();
        element = new int[count];
        element = readInteger(count);
        int minimum = findMin(element);
        System.out.println("The array is: " + Arrays.toString(element));
        System.out.println("The minimum value of array is: " + minimum);

    }
    private static int[] readInteger(int cnt)
    {
        int[] arr =new int[cnt];
        System.out.println("Enter "+ cnt + " number of integers\r");
        for (int i=0; i<cnt ; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }
    private static int findMin(int[] arr){
        int min=Integer.MAX_VALUE;
        for (int i=0; i<arr.length ; i++)
        {
             if (arr[i]<min)
                 min = arr[i];
        }
        return min;
    }
}
