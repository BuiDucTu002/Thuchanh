public class PaperBook extends Book {
    @Override
    protected void brow() {
        System.out.println("Brow EBook");
    }
    @Override
    protected void open() {
        System.out.println("Mở PaperBook");
    }
    @Override
    protected void close() {
        System.out.println("Close PaperBook");
    }
}
