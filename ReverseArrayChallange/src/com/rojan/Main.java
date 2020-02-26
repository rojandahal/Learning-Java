package com.rojan;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in array: " );
        int count = scan.nextInt();
        int array[] = new int[count];
        System.out.println("Enter the array: ");
        for (int i =0 ; i<array.length ; i++){
            array[i] = scan.nextInt();
        }

        /*
Either this to copy the array Syntax is: System.arraycopy(source_arr,sourcePos,dest_arr,destPos,arr_length);

        int[] reverseArrays = new int[array.length];
        System.arraycopy(array,0,reverseArrays,0,array.length);
*/
        int reverseArrays[] = array.clone();        //Or this To copy the array
        reverseArrays = reverseArray(reverseArrays);
        System.out.println("The non reversed array: \n" + Arrays.toString(array));
        System.out.println("The reversed array: \n" + Arrays.toString(reverseArrays));

    }
    private static int[] reverseArray(int[] arr)
    {
        int j = arr.length-1;
        for (int i=0; i<=j ; i++)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        return arr;
    }
}
