import java.util.Scanner;

public class BookManager {



    public static  void main(String[] args){
        Book b = new Book();

    }

    /**
     * Function to Add Book
     */
    public Book AddBook(){
        String author;
        String title;
        int isbn;
        String belongsTo;
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book();

        System.out.println("To add a new Book");
        System.out.println("Enter the title of the new book:");
        title = sc.nextLine();

        System.out.println("Enter the author of the new book:");
        author = sc.nextLine();

        System.out.println("Enter the your username:");
        belongsTo = sc.nextLine();


        System.out.println("Enter the isbn of the new book:");
        isbn = sc.nextInt();

        b1.setAuthor(author);
        b1.setTitle(title);
        b1.setIsbn(isbn);
        b1.setBelongsTo(belongsTo);

        return b1;

    }
}
