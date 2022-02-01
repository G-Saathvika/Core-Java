import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = keyboard.nextInt();

        if(number%3==0){
            System.out.println(number+" is divisible by 3");
        }
        else{
            System.out.println(number+" is NOT divisible by 3");
        }
    }
}
