public class Book implements Comparable<Book> {
    String title;
    String author;
    int isbn;
    String belongsTo;

    public String getBelongsTo() {
        return belongsTo;
    }

    public void setBelongsTo(String belongsTo) {
        this.belongsTo = belongsTo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public static void main(String[] args){

    }


    @Override
    public int compareTo(Book book) {

        if(this.isbn > book.isbn){
            return 1;
        }else
        return 0 ;
    }
}
