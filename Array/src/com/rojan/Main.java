package com.rojan;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	    int[] myArray = getArray(5);
	    for (int i=0;i<myArray.length;i++)
        {
            System.out.println("The " + i +"element is " + myArray[i]);
        }
	    double Average = getAverage(myArray);
        System.out.println("\rThe average is: " + Average);
    }

    public static int[] getArray(int number)
    {
        int[] array = new int[number];
        System.out.println("Enter " + number +" number of arrays");
        for (int i=0;i<number;i++)
        {
            array[i] = scanner.nextInt();
        }

        return array;
    }
    public static double getAverage(int[] array)
    {
        int sum = 0;
        for (int i=0; i<array.length;i++)
        {
            sum = sum + array[i];
        }
        return (double)sum / (double) array.length;
    }
}
