public class StringMethods1 {
    public static void main(String[] args) {
        String name1 = "John Baugh";
        String name2 = "John Baugh";
        String name3 = "Rob Percival";
        String myName= "Saathvika";

        for(int i=0;i<name1.length();i++){
            System.out.print(name1.charAt(i)+" ");
        }

        System.out.println();

        if(name1.equals(name2)){
            System.out.println("names are equal");
        }
        else{
            System.out.println("names aren't equal");
        }

        if(name1.compareTo(name3)>0){
            System.out.println("name1 > name3");
        }
        else{
            System.out.println("name1 <= name3");
        }

        if(myName.compareTo(name1)>0){
            System.out.println("myName > name1");
        }
        else{
            System.out.println("myName <= name1");
        }
    }
}
