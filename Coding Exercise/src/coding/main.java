package coding;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {

        long milesPerHr = SpeedConverter.tomilesPerhr(10.5);

        System.out.println("Miles= " + milesPerHr);

        SpeedConverter.printConversion(10.5);
    }
}
