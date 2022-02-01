import java.util.*;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int age;

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        for(int i=0;i<5;i++){
            System.out.print("Enter a name:\t");
            name = keyboard.next();
            System.out.print("Enter an age:\t");
            age = keyboard.nextInt();

            names.add(name);
            ages.add(age);
        }

        for(int i=0;i< names.size();i++){
            System.out.println(names.get(i)+" is "+ages.get(i)+" years old");
        }
    }
}
