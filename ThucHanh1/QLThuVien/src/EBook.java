public class EBook extends Book {
@Override
    protected void brow() {
    System.out.println("Brow EBook");
}
    protected void close() {
        System.out.println("Close EBook");
    }
    protected void open() {
        System.out.println("Opening EBook");
    }
}
