package com.converter;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class InchCentimeter {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter feet: ");
        int feet = input.nextInt();
        System.out.println("Enter inch: ");
        int inch = input.nextInt();
        double res=calcFeetAndInchesToCentimeter(feet,inch);
        System.out.println(feet  + " Feet " + inch + " Inch = " + res + " Centimeter ");
        System.out.println("Enter the inches: ");
        inch = input.nextInt();
        res=calcFeetAndInchesToCentimeter(inch);
        System.out.println(inch  + " Inch = " + res + " Centimeter ");
    }
    public static double calcFeetAndInchesToCentimeter (int feet, int inch){
        if (feet <0 || inch<0 || inch>12) {
            System.out.println("Invalid Feet or Inches Parameter");
            return -1;
        }
        int temp=feet*12;
        double centimeter=(double) (temp+inch)* 2.54;

        return centimeter;
    }
    public static double calcFeetAndInchesToCentimeter ( int inch){
        if (inch<=0 )
            return -1;
        int feet= inch /12;
        inch = inch % 12;
        double res= calcFeetAndInchesToCentimeter(feet , inch );
        return res;
    }
}

