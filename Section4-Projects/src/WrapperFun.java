import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> myAL = new ArrayList<>();

        myAL.add(15);
        myAL.add(20);

        for(int i=0;i<myAL.size();i++){
            System.out.println(myAL.get(i));
        }

        String someVal = "465";
        int numericVal = Integer.parseInt(someVal);
        numericVal += 10;
        System.out.println(numericVal);

        String val = "3.14159";
        double dubVal = Double.parseDouble(val);
        System.out.println(dubVal);
    }
}
