package com.applypackage;

import com.seriesLib.*;
public class Main {

    public static void main(String[] args) {
	        int i;
	        Series series = new Series();
	        for (i=0;i<=10;i++){
                System.out.println(series.fibonacci(i));
            }
        System.out.println("********************************");
        for (i=0;i<=10;i++){
            System.out.println(series.nSum(i));
        }
        System.out.println("********************************");
        for (i=0;i<=10;i++){
            System.out.println(series.factorial(i));
        }
        System.out.println("********************************");
    }
}
