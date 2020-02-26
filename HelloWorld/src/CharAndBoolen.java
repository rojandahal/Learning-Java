import javax.print.DocFlavor;

public class CharAndBoolen {
    public static void main(String[] args) {
        String myString ="Hello this is me";
        System.out.println(myString);
        String myStr2=myString+ ",This is " +
                "also me";
        System.out.println(myStr2 + " \u00A9 2015");
        String mystr="10";
        int myint=10;
        mystr = mystr + myint;
        System.out.println("The number is="+ mystr);
        String name="Suyog";
        System.out.println("Java is way better than Fucking asshole python");
    }
}
