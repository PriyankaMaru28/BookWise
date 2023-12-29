import java.util.HashMap;

public class Librarian extends Person{

    private int LibId;


    public int getLibId() {
        return LibId;
    }

    public int setLibId (int libId) {
        this.LibId = libId;
        return this.LibId;
    }
    @Override
    public void AddUser(HashMap<Integer, Person> p1) {

        Librarian l = new Librarian();
        l.setUsername("Rita");
        l.setType("Librarian");
        setLibId(p1.size()+1);

        Librarian l1 = new Librarian();
        l1.setUsername("Seema");
        l1.setType("Librarian");
        setLibId(p1.size()+1);


        p1.put(getLibId(),l);
        p1.put(getLibId(),l1);

        System.out.println("Librarians...");
        for(Person ele : p1.values()){
            System.out.println(ele.getUsername() + ele.getType());
        }





    }


    public static void main(String[] args) {









    }



//    @Override
//    public void AddUser() {
//
//        System.out.printf("You have been added as a Librarian %d", LibId+1);
//    }
}
