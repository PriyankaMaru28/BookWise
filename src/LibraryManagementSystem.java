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
        System.out.println("Before sorting...   ");
        System.out.println("========================================");
//        for(Book ele:b1){
//            System.out.println(ele.title +" "+ ele.author +" "+ ele.isbn+" belongs to :"+ele.belongsTo);
//        }
//        System.out.println("========================================");
//        System.out.println("After sorting...   ");

//        b1.stream().sorted().forEach(ele ->  System.out.println(ele.title +" "+ ele.author +" "+ ele.isbn+" belongs to :"+ele.belongsTo));


        System.out.println("===============DISPLAY THE BOOKS=========================");
        bm1.DisplayBook(b1);
//        for(Book ele:b1){
//            System.out.println(ele.title +" "+ ele.author +" "+ ele.isbn+" belongs to :"+ele.belongsTo);
//        }
        System.out.println("========================================");


    }

    public boolean UserChoices(ArrayList<Book> b1, int value, HashMap<Integer,Person> p1){
        BookManager bm = new BookManager();
        switch (value){
            case 1:  System.out.println("Register as a Member");
            Member p = new Member();
            p.AddUser(p1);
            break;
            case 2:
                System.out.println("Add Book");
                AddBook(b1);
                break;
            case 3: System.out.println("Remove Book");
            break;
            case 4: System.out.println("Search for book");

                System.out.println("Enter the isbn no:");
                Scanner sc = new Scanner(System.in);
                int isbn = sc.nextInt();
                bm.SearchBook(b1,isbn);
            break;
            case 5: bm.DisplayBook(b1);
            break;
            case 6: System.out.println("Thank you for using our Library");
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
        b3.setTitle("Supandi");
        b3.setAuthor("Ravi Kumar");
        b3.setBelongsTo("Amita");
        b3.setIsbn(1540);
        b2.setTitle("Reader's Digest");
        b2.setAuthor("Ravikanth");
        b2.setBelongsTo("Priya Samva");
        b2.setIsbn(1545);
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
                    "6. Exit the Library");
            int choice = sc.nextInt();

        exitProgram =  lms.UserChoices(b1, choice, p1);

        }

    }

}
