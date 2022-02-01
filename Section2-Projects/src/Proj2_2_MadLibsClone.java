import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        String adjective1 = keyboard.nextLine();

        System.out.print("Enter a girl's name: ");
        String girlName = keyboard.nextLine();

        System.out.print("Enter another adjective: ");
        String adjective2 = keyboard.nextLine();

        System.out.print("Enter an occupation: ");
        String occupation1 = keyboard.nextLine();

        System.out.print("Enter the name of a place: ");
        String place = keyboard.nextLine();

        System.out.print("Enter the name of a piece of clothing: ");
        String clothing = keyboard.nextLine();

        System.out.print("Enter the name of a hobby: ");
        String hobby = keyboard.nextLine();

        System.out.print("Enter another adjective: ");
        String adjective3 = keyboard.nextLine();

        System.out.print("Enter another occupation: ");
        String occupation2 = keyboard.nextLine();

        System.out.print("Enter a boy's name: ");
        String boyName = keyboard.nextLine();

        System.out.print("Enter a man's name: ");
        String manName = keyboard.nextLine();

        System.out.println("There once was a "+adjective1+" girl named "+girlName+", who was a "+adjective2+" "+occupation1+" in the Kingdom of "+place);
        System.out.println("She loved to wear "+clothing+" and to "+hobby+".She wanted to marry the "+adjective3+" "+occupation2+" named "+boyName+" but her father,King "+manName+" forbid her from seeing him.");





    }
}
