import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;

/**
 * Can be done by Librarian ,
 * This class is used to check if any books are overdue
 * A function to calculate LateFees --> Borrowed Date > Due date
 */

public class LoanManager {

    LocalDate borrowedDate;
    Book b;
    String MemberName;

    float lateFees;

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }


    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public Book getB() {
        return b;
    }

    public void setB(Book b) {
        this.b = b;
    }

    public static void main(String[] args) {

    }

    public void lateFeeCalculation(Book book){
        System.out.println("inisde loan maanger");


        LocalDate currentDate = LocalDate.now();

        long daysBetween = DAYS.between(book.getBorrowedDate(), currentDate);

        System.out.println("After... " + daysBetween);

        if(daysBetween > 7){
            long chargesEachDay = 5;
            long TotalPenalty = daysBetween * chargesEachDay;
            System.out.println(  book.getTitle() + "has returned "+ daysBetween+" days late.");
            System.out.println(book.belongsTo +" has to pay a penalty of $"+TotalPenalty+" by end of this week");
        }else {
            System.out.println(book.getTitle() + " has been returned by "+ book.getBelongsTo() + " successfully.");
        }
        book.setAvailabe(true);

    }


}
