package book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    PrintBook book = new PrintBook();

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

    @Test
    public void bookIsbnTest(){
        book.setIsbn("27327TR623");
        assertEquals("27327TR623", book.getIsbn());
    }

    @Test
    public void bookPublisherTest(){
        book.setPublisher("WatchTower's Lmt");
        assertEquals("WatchTower's Lmt", book.getPublisher());
    }
}
