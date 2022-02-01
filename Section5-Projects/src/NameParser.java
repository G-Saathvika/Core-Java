import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String firstName;
        String lastName;

        System.out.println("Enter your name:");
        name = keyboard.nextLine();

        int indexOfSpace = name.indexOf(" ");

        firstName = name.substring(0,indexOfSpace);
        lastName =name.substring(indexOfSpace+1) ;

        firstName = firstName.toUpperCase();
        lastName = lastName.toLowerCase();

        System.out.println("uppercase version of first name:"+firstName);
        System.out.println("lowercase version of last name :"+lastName);
    }
}
