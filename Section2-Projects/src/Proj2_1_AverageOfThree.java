import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");
        double num1 = keyboard.nextDouble();
        double num2 = keyboard.nextDouble();
        double num3 = keyboard.nextDouble();
        keyboard.nextLine();
        double avg;

        avg = (num1+num2+num3) / 3.0;

        System.out.println("Average is : "+avg);
    }
}
