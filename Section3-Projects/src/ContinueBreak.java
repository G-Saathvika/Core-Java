public class ContinueBreak {
    public static void main(String[] args) {
        int count = 10;

        while(count<10){
            if(count==5){
                count++;
                continue;
            }
            System.out.print(count+"\t");

            count++;
        }
    }
}
