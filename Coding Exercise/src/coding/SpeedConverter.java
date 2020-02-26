package coding;

public class SpeedConverter {
    public static long tomilesPerhr(double kiloMperHr) {

        if (kiloMperHr < 0)
            return -1;

        return Math.round(kiloMperHr / 1.609);

    }

    public static void printConversion(double kiloMPerHr) {

        if (kiloMPerHr < 0)
            System.out.println("Invalid Value ");

        long miles = tomilesPerhr(kiloMPerHr);

        System.out.println(kiloMPerHr + " km/hr = " +
                miles + " miles/hr");
    }

}
