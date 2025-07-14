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
    public void bookDetailTest(){
        book.setBookTitle("Peace");
        book.setBookAuthor("Mr. Dapo");
        System.out.println(book.toString());
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

    AudioBook books = new AudioBook();

    @Test
    public void audioBookSizeTest(){
        books.setArtistName("Jack Ma");
        assertEquals("Jack Ma", books.getArtistName());
    }

    @Test
    public void audioBookPlayLengthTest(){
        books.setPlayLength("45:08");
        assertEquals("45:08", books.getPlayLength());
    }

    @Test
    public void validBookSizeTest(){
        books.setBookSize("56 MB");
        assertEquals("56 MB", books.getBookSize());
    }
}
