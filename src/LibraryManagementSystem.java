import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LibraryManagementSystem {

    static boolean  exitProgram = false;
    public <b1> void AddBook(ArrayList<Book> b1){
        BookManager bm1 = new BookManager();
        Book newbook1 = bm1.AddBook();
        b1.add(newbook1);
        System.out.println("Library Management System...   ");
//        System.out.println("Before sorting...   ");
//        System.out.println("========================================");
//        for(Book ele:b1){
//            System.out.println(ele.title +" "+ ele.author +" "+ ele.isbn+" belongs to :"+ele.belongsTo);
//        }

        System.out.println("After sorting...   ");

     //  ArrayList<Book> newBook = b1.stream().sorted().forEach(ele ->  System.out.println(ele.title +" "+ ele.author +" "+ ele.isbn+" belongs to :"+ele.belongsTo));

//        ArrayList<Book> newBook = b1;
//
//        newBook.stream().sorted().forEach(ele ->  System.out.println(ele.title +" "+ ele.author +" "+ ele.isbn+" belongs to :"+ele.belongsTo));
//
        System.out.println("===============DISPLAY THE BOOKS=========================");
        bm1.DisplayBook(b1);
        System.out.println("========================================");
//        for(Book ele:b1){
//            System.out.println(ele.title +" "+ ele.author +" "+ ele.isbn+" belongs to :"+ele.belongsTo);
//        }
//        System.out.println("========================================");


    }

    public boolean UserChoices(ArrayList<Book> b1, int value, HashMap<Integer,Person> p1){
        BookManager bm = new BookManager();

        Scanner sc = new Scanner(System.in);
        switch (value){
            case 1:  System.out.println("Register as a Member");
            Member p = new Member();
            p.AddUser(p1);
            break;
            case 2:
                System.out.println("Add Book");
                AddBook(b1);
                break;
            case 3: System.out.println("Remove Book while checking out");
            System.out.println("Enter the title of Book: ");
            String removeBook = sc.nextLine();
            bm.RemoveBook(b1,removeBook);
            break;
            case 4: System.out.println("Search for book");
                bm.DisplayBook(bm.SearchBook(b1));
            break;
            case 5: bm.DisplayBook(b1);
            break;
            case 6: System.out.println("Return book: ");
            ArrayList<Book> newBookList = bm.SearchBook(b1);
                // filter books by availability

            Book newBook = new Book();

            bm.DisplayBook(newBookList);


            System.out.println("Set Book Details....");
            for(Book bl:newBookList){
                newBook.setTitle(bl.title);
                newBook.setAuthor(bl.author);
                newBook.setIsbn(bl.isbn);
                newBook.setBelongsTo(bl.belongsTo);
                newBook.setBorrowedDate(bl.borrowedDate);
                newBook.setAvailabe(bl.isAvailabe);
            }

            System.out.println("=============================");
            LoanManager lm = new LoanManager();
            lm.lateFeeCalculation(newBook);

            // Search book  by isbn --> get book details --> pass to loan manager
                // cal overdue book by using curr date and borr book date -->
                // if diff > 7 then late fees or else no fees --> mark book as available
                break;
            case 7: System.out.println("Display all users");
            Person m = new Member();
            m.DisplayUsers(p1);

                break;
            case 8: System.out.println("Thank you for using our Library");
                 return true;
            default:System.out.println("No such choice exists");
        }
        return false;
    }


    public static void main (String[] args){

        ArrayList<Book> b1 = new ArrayList<>();
        HashMap<Integer,Person> p1 = new HashMap();
        Scanner sc = new Scanner(System.in);
        /**
         * Add a librarian and books at start
         * */
        Librarian  l = new Librarian();
        l.AddUser(p1);

        Book b = new Book();
        Book b2 = new Book();
        Book b3 = new Book();
        b.setTitle("Champak");
        b.setAuthor("A.B.Sathe");
        b.setBelongsTo("ABC");
        b.setIsbn(1345);
        LocalDate date = LocalDate.of(2024, Month.JANUARY, 10);
        b.setBorrowedDate(date);
        b.setAvailabe(false);
        b3.setTitle("Supandi");
        b3.setAuthor("Ravi Kumar");
        b3.setBelongsTo("Amita");
        b3.setIsbn(1540);
        LocalDate date3 = LocalDate.of(2023, Month.MAY, 26);
        b3.setBorrowedDate(date3);
        b3.setAvailabe(true);
        b2.setTitle("Reader's Digest");
        b2.setAuthor("Ravikanth");
        b2.setBelongsTo("Priya Samva");
        b2.setIsbn(1545);
        LocalDate date2 = LocalDate.of(2023, Month.NOVEMBER, 30);
        b2.setBorrowedDate(date2);
        b2.setAvailabe(true);
        b1.add(b);
        b1.add(b2);
        b1.add(b3);


        LibraryManagementSystem lms = new LibraryManagementSystem();

    while(!exitProgram) {

            System.out.println("Type the choices :\n" +
                    "1. Register as a Member/Librarian\n " +
                    "2. Add Book\n" +
                    "3. Remove Book\n" +
                    "4. Search for a Book\n" +
                    "5. Display all the Books\n" +
                    "6. Return Book\n" +
                    "7. Display all users\n"+
                    "8. Exit the Library");
            int choice = sc.nextInt();

        exitProgram =  lms.UserChoices(b1, choice, p1);

        }

    }

}
