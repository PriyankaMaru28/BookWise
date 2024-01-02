import java.util.ArrayList;

import java.util.Scanner;
import java.util.stream.Stream;

public class BookManager {

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


    public void SearchBook(ArrayList<Book> b1,int isbn) {

        // Search by isbn
        // Add additional comparator method to filter books
        // by title and author name

        Stream<Book> newBookColl = b1.stream().filter((Book b) -> b.getIsbn() == isbn);

        newBookColl.forEach(ele -> System.out.println(ele.title + " " + ele.author + " " + ele.isbn));


    }

    public void DisplayBook(ArrayList<Book> b1){

        b1.stream().forEach(ele->System.out.println("title : "+ele.title + " Author: " + ele.author + " " + ele.isbn));
    }





}
