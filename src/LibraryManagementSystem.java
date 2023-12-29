import java.util.*;

public class LibraryManagementSystem {

    static boolean  exitProgram = false;
    public <b1> void AddBook(ArrayList<Book> b1){
        BookManager bm1 = new BookManager();
        Book newbook1 = bm1.AddBook();
        b1.add(newbook1);
        System.out.println("Library Management System...   ");
        System.out.println("Before sorting...   ");
        System.out.println("========================================");
        for(Book ele:b1){
            System.out.println(ele.title +" "+ ele.author +" "+ ele.isbn+" belongs to :"+ele.belongsTo);
        }
        System.out.println("========================================");
        System.out.println("After sorting...   ");
        Collections.sort(b1);

        System.out.println("===============AFTER SORTING BY AUTHOR NAME=========================");
        for(Book ele:b1){
            System.out.println(ele.title +" "+ ele.author +" "+ ele.isbn+" belongs to :"+ele.belongsTo);
        }
        System.out.println("========================================");




    }

    public boolean UserChoices(ArrayList<Book> b1, int value, HashMap<Integer,Person> p1){
        switch (value){
            case 1:  System.out.println("Register as a Member");
            Person p = new Member();
            p.AddUser(p1);
            break;
            case 2:
                System.out.println("Add Book");
                AddBook(b1);
                break;
            case 3: System.out.println("Remove Book");
            break;
            case 4: System.out.println("Search for book");
            break;
            case 5: System.out.println("Thank you for using our Library");
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
         * Add a librarian at start
         * */
        Librarian  l = new Librarian();
        l.AddUser(p1);

        LibraryManagementSystem lms = new LibraryManagementSystem();



    while(!exitProgram) {

            System.out.println("Type the choices :\n" +
                    "1. Register as a Member/Librarian\n " +
                    "2. Add Book\n" +
                    "3. Remove Book\n" +
                    "4. Search for a Book\n" +
                    "5. Exit the Library");
            int choice = sc.nextInt();

        exitProgram =  lms.UserChoices(b1, choice, p1);

        }







    }


}
