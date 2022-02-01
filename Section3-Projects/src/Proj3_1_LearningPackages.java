import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int packageNumber;
        int numberOfCourses;
        int baseCost;
        int costPerCourse;
        int numIncluded;
        int totalCost;

        System.out.println("Enter the package you want? 1,2 or 3?");
        packageNumber = keyboard.nextInt();

        System.out.println("How many courses do you want to enroll this month?");
        numberOfCourses = keyboard.nextInt();

        if(packageNumber==1){
            baseCost=10;
            costPerCourse=6;
            numIncluded=2;
        }
        else if(packageNumber==2){
            baseCost=12;
            costPerCourse=4;
            numIncluded=4;
        }
        else {
            baseCost=15;
            costPerCourse=3;
            numIncluded=6;
        }

        if(numberOfCourses>numIncluded){
            totalCost = baseCost+(numberOfCourses-numIncluded)*costPerCourse;
        }
        else{
            totalCost = baseCost;
        }

        System.out.println("Total cost is $"+totalCost);
    }
}
