import java.awt.print.Paper;

public class BookFactory {
    public enum  BookType {
        PaperBook, EBook
    }
    public Book createBook(BookType bookType){
        Book book = null;
        switch(bookType){
            case BookType.PaperBook:;
                book = new PaperBook();
                break;

            case BookType.EBook:
                book = new EBook();
                break;
        }
        return book;
    }
}
