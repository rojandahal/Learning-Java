import java.sql.SQLOutput;
import java.util.Scanner;

public class readinguserinput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers to calculate maximum and minimum:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int res = Max(num1, num2);
        System.out.println("The maximum number is: "+ res);
        res= min(num1, num2);
        System.out.println("The minimum number is: "+ res);
    }

    public static int Max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }
    public static int min (int a, int b)
    {
        if (a<b)
            return a;
        else
            return b;
    }
}