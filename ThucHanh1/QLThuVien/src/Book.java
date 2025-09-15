public abstract class Book {
    private String name;
    public Book(String name, String author, int price) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected Book() {
    }

    public final void borrowBook() {
        open();
        brow();
        close();
    }
    protected abstract void open();
    protected abstract void close();
    protected abstract void brow();
}
