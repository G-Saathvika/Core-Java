public class BookDemo {
    public static void main(String[] args) {
        Book gameOfThrones = new Book("George Martin","Game of Thrones","Fantasy",864);
        Book mathBook = new Book("James Stewart","Calculus","Math",1372);
        Book javaBook = new Book("Joel Murach","Murach's Java Programming","Programmin",888);

//        printBookDetails(gameOfThrones);
//        printBookDetails(mathBook);
//        printBookDetails(javaBook);

        gameOfThrones.printBookDetails();
        mathBook.printBookDetails();
        javaBook.printBookDetails();
    }

//    public  static void printBookDetails(Book book){
//        System.out.println(book.getTitle());
//        System.out.println("by "+book.getAuthor());
//        System.out.println("has "+book.getNumPages()+
//                " pages, and its genre is "+book.getGenre());
//        System.out.println();
//    }
}
