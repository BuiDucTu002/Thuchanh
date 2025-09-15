import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        BookFactory bookFactory = new BookFactory();
        System.out.println("nhập sách cần khởi tạo: 1. tạo Ebook. 2. tạo PaperBook");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1){
            BookFactory.BookType type = BookFactory.BookType.PaperBook;
            Book book = bookFactory.createBook(type);
            book.borrowBook();
        }
        else if (n == 2) {
            BookFactory.BookType type = BookFactory.BookType.EBook;
            Book book = bookFactory.createBook(type);
            book.borrowBook();
        }

    }
}
