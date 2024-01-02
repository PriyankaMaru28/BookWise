import java.util.Date;

/**
 * Can be done by Librarian ,
 * This class is used to check if any books are overdue
 * A function to calculate LateFees --> Borrowed Date > Due date
 */

public class LoanManager {
    Date dueDate;
    Date borrowedDate;
    Book b;
    String MemberName;

    int lateFees;

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }



    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(Date borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public Book getB() {
        return b;
    }

    public void setB(Book b) {
        this.b = b;
    }


}
