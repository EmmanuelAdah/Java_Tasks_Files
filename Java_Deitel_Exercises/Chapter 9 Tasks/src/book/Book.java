package book;

public class Book {
    private String bookTitle;
    private String bookAuthor;

    public Book(String bookTitle, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    public void setBookTitle(String title) {
        this.bookTitle = title;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookAuthor(String author) {
        this.bookAuthor = author;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String toString() {
        String bookDetails = String.format("Book Title: %s %nAuthor: %s %n", bookTitle, bookAuthor);
        return bookDetails;
    }
}
