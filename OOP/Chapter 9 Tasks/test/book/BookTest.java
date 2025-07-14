package book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    Book book = new Book();

    @Test
    public void bookTitleTest(){
        book.setBookTitle("Peace");
        assertEquals("Peace", book.getBookTitle());
    }

    @Test
    public void bookAuthorTest(){
        book.setBookAuthor("Mr. Dapo");
        assertEquals("Mr. Dapo", book.getBookAuthor());
    }
}