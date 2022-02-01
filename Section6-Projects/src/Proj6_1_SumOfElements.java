import java.util.ArrayList;
import java.util.Scanner;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(333);
        myList.add(21);
        myList.add(5);
        myList.add(62);

        int result = sumElements(myList);
        System.out.println("Sum is : "+result);
    }

    public static int sumElements(ArrayList<Integer> al){
        int sum=0;
        for(int i=0;i<al.size();i++){
            sum += al.get(i);
        }
        return sum;
    }
}
