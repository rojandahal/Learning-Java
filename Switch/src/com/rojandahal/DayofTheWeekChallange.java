package com.rojandahal;

public class DayofTheWeekChallange {
    public static void main (String[] args)
    {
        printDayofTheWeek(1);
    }

    public static void printDayofTheWeek(int day)
    {
        switch(day)
        {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
                default:
                    System.out.println("Invalid Day");
        }
    }

}
