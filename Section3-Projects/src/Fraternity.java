import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        char gender;

        System.out.println("Enter your age:");
        age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter your gender:");
        gender = keyboard.nextLine().charAt(0);

        if(age >= 19 && gender == 'M'){
            System.out.println("You can join the fraternity");
        }
        else{
            System.out.println("Sorry, you can't join the fraternity");
        }
    }
}
