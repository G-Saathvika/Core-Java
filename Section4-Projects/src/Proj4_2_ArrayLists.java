import java.util.*;

public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        ArrayList<Double> al = new ArrayList<>();
        double input;

        System.out.println("Enter 0 or more to put in list"+
                " or negative to exit");

        input = keyboard.nextDouble();

        while(input>=0){
            al.add(input);

            System.out.println("Enter 0 or more to put in list"+
                    " or negative to exit");

            input = keyboard.nextDouble();
        }

        for(int i=al.size()-1;i>=0;i--){
            System.out.println(al.get(i));
        }
    }
}
