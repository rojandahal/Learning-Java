public class area {
    public static void main(String[] args) {
        float res = calcarea(20, 30);
        System.out.println("The area of triangle is: " + res);
        float reslt = calcarea(3, 4, 5);
        System.out.println("The area of triangle withs a,b,c: " + reslt);

    }

    public static float calcarea(int b, int h) {
        float area = (float) 0.5 * b * h;
        return area;
    }

    public static float calcarea(int a, int b, int c) {
        float s = ((a + b + b) / 2);
        float area = (float) java.lang.Math.sqrt(s * (s - a));
        return area;
    }

}
