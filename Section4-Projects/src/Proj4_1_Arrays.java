import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int[] myArray = new int[5];

        System.out.println("Enter 5 integers:");

        for(int i=0;i<myArray.length;i++){
            myArray[i]= keyboard.nextInt();
        }

        for(int num : myArray){
            System.out.println(num*2);
        }
    }
}
