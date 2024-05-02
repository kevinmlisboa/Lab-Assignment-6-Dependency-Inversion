public class Book implements Resource{
    private String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void borrow() {
        System.out.println("The book '" + bookName + "' has been borrowed by a student.");
    }
}
