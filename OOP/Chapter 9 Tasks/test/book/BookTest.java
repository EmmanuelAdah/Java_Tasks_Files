package book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    PrintBook book = new PrintBook("Design", "Mr. Dapo", "WatchTower's Lmt","27327TR623");

    @Test
    public void bookTitleTest(){
        assertEquals("Design", book.getBookTitle());
    }

    @Test
    public void setBookTitleTest(){
        book.setBookTitle("The Art Of Design");
        assertEquals("The Art Of Design", book.getBookTitle());
    }

    @Test
    public void bookAuthorTest(){
        assertEquals("Mr. Dapo", book.getBookAuthor());
    }

    @Test
    public void setBookAuthorTest(){
        book.setBookAuthor("Wale J.K");
        assertEquals("Wale J.K", book.getBookAuthor());
    }

    @Test
    public void bookDetailTest(){
        book.setBookTitle("Peace");
        book.setBookAuthor("Mr. Dapo");
        System.out.println(book.toString());
    }

    @Test
    public void bookIsbnTest(){
        assertEquals("27327TR623", book.getIsbn());
    }

    @Test
    public void setBookIsbnTest(){
        book.setIsbn("TN43748338");
        assertEquals("TN43748338", book.getIsbn());
    }

    @Test
    public void bookPublisherTest(){
        assertEquals("WatchTower's Lmt", book.getPublisher());
    }

    @Test
    public void setBookPublisherTest(){
        book.setPublisher("The Women's publishers");
        assertEquals("The Women's publishers", book.getPublisher());
    }

    AudioBook books = new AudioBook("Rich Mindset", "The Mind", "MIND", "23 MB", "23:34");

    @Test
    public void audioBookArtistTest(){
        assertEquals("MIND", books.getArtistName());
    }

    @Test
    public void setAudioBookArtistTest(){
        books.setArtistName("Art D.E");
        assertEquals("Art D.E", books.getArtistName());
    }

    @Test
    public void audioBookPlayLengthTest(){
        assertEquals("23:34", books.getPlayLength());
    }

    @Test
    public void setAudioBookPlayLengthTest(){
        books.setPlayLength("43:14");
        assertEquals("43:14", books.getPlayLength());
    }

    @Test
    public void validBookSizeTest(){
        books.setBookSize("23 MB");
        assertEquals("23 MB", books.getBookSize());
    }
}
