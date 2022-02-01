public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobAge = 20;
        int currentAge = 20;

        String myName = "John";
        String yourName = "Johnny";

        System.out.println("myBool is  "+myBool);
        System.out.println("yourBool is "+yourBool);

        //relational operations
        boolean ageComparison = myAge > yourAge;
        System.out.println("myAge > yourAge?: "+ageComparison);

        ageComparison = yourAge > bobAge;
        System.out.println("yourAge > bobAge?: "+ageComparison);

        ageComparison = yourAge == bobAge;
        System.out.println("yourAge == bobAge?: "+ageComparison);

        boolean nameComparison = myName.equals(yourName);
        System.out.println("does names match?: "+nameComparison);

        ageComparison = currentAge >= 21;
        System.out.println("currentAge >= 21?: "+ageComparison);
    }
}
