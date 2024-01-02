import java.util.HashMap;
import java.util.Scanner;

public class Member extends Person {

    @Override
    public void AddUser(HashMap<Integer,Person> p1) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==========================Enter your details==================");
        System.out.println("Enter you name: ");
        username = sc.nextLine();
        System.out.println("Enter you type of member, Librarian/Member: ");
        type = sc.nextLine();

        Member m = new Member();
        m.setUsername(username);
        m.setType(type);

        p1.put(p1.size()+1,m);

        System.out.println(p1.toString());

    }

    public static void main(String[] args) {

    }


}
