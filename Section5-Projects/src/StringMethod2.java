import java.util.Locale;

public class StringMethod2 {
    public static void main(String[] args) {
        String myName = "Saathvika G";

        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();

        int whereIsT = myName.indexOf("t");

        String lastName = myName.substring(10);

        System.out.println("upper is "+upper);
        System.out.println("lower is "+lower);
        System.out.println("t is at index "+whereIsT);
        System.out.println("last name "+lastName);

    }
}
