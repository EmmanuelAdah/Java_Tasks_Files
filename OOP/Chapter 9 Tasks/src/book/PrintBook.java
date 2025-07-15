package book;

public class PrintBook extends Book {
    private String publisher;
    private String isbn;

    public PrintBook(String bookTitle, String bookAuthor, String publisher, String isbn) {
        super(bookTitle, bookAuthor);
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }
}
