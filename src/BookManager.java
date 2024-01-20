import java.time.LocalDate;
import java.util.ArrayList;

import java.util.Date;
import java.util.Scanner;
import java.util.stream.Collectors;
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

        LocalDate today = LocalDate.now();

        //Librarian is adding a new book
        b1.setAvailabe(true);
        b1.setAuthor(author);
        b1.setTitle(title);
        b1.setIsbn(isbn);
        b1.setBelongsTo(belongsTo);
        b1.setBorrowedDate(today);

        return b1;

    }

    // Only used by users to check out book --> filter by availability
    public Book Checkout(){

        return null;
    }


    public ArrayList<Book> SearchBook(ArrayList<Book> b1) {

        // Search by isbn
        // Add additional comparator method to filter books
        // by title and author name
        System.out.println("Enter the isbn no:");
        Scanner sc = new Scanner(System.in);

        int isbn = sc.nextInt();

        Stream<Book> newBookColl = b1.stream().filter((Book b) -> b.getIsbn() == isbn);

        //newBookColl.forEach(ele -> System.out.println(ele.title + " " + ele.author + " " + ele.isbn+" "+ele.borrowedDate));
        return (ArrayList<Book>) newBookColl.collect(Collectors.toList());

    }

    public void DisplayBook(ArrayList<Book> b1){

        b1.stream().forEach(ele->System.out.println("title : "+ele.title + " Author: " + ele.author + " ISBN: " + ele.isbn+" Date: "+ele.borrowedDate.toString()));
    }

    /**
     * Return the updated books and call the display book function
     * @param b1
     * @param removeBook
     */
    public void RemoveBook(ArrayList<Book> b1,String removeBook){
        System.out.println("Book to be removed : "+removeBook);

        b1.stream().filter(ele -> !(ele.getTitle().equals(removeBook))).forEach(ele->System.out.println("title : "+ele.title + " Author: " + ele.author + " ISBN:" + ele.isbn+" Date: "+ele.borrowedDate));

    }


}
