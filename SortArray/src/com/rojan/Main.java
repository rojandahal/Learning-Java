package com.rojan;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	    int[] myArray = getArray(5);
	    printArray(myArray);
	    myArray = sortInteger(myArray);
        System.out.println("The sorted array is: ");
	    printArray(myArray);
    }

    public static int[] getArray(int num)
    {
        int[] array = new int[num];
        System.out.println("Enter the elements in array.");
        for (int i=0;i<array.length;i++)
        {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array)
    {
        for (int i=0 ; i<array.length ; i++) {
            System.out.println("The " + i + " Element is: " + array[i]);
        }
    }

    public static int[] sortInteger (int[] array)
    {
        int temp;
        for (int i=0; i<array.length ; i++) {
            for (int j = i; j > 0  ; j--) {
                if (array[j] > array[j-1]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return  array;
    }
}
