import java.util.*;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName;
        String firstName;
        String lastName;

        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();

        for(int i=0;i<5;i++){
            System.out.print("Enter your full name:\t");
            fullName = sc.nextLine();
            int indexOfSpaces = fullName.indexOf(" ");
            firstName = fullName.substring(0,indexOfSpaces);
            lastName = fullName.substring(indexOfSpaces+1);

            firstNames.add(firstName);
            lastNames.add(lastName);
        }

        for(int i=0;i< firstNames.size();i++){
            for(int j=0;j< lastNames.size();j++){
                System.out.println(firstNames.get(i)+" "+lastNames.get(j));
            }
        }

    }
}
