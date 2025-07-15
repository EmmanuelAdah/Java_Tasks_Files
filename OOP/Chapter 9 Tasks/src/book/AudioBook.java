package book;

public class AudioBook extends Book{
    private String artistName;
    private String bookSize;
    private String playLength;

    public AudioBook(String bookTitle, String bookAuthor, String artistName, String bookSize, String playLength) {
        super(bookTitle, bookAuthor);
        this.artistName = artistName;
        this.bookSize = bookSize;
        this.playLength = playLength;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setPlayLength(String playLength) {
        this.playLength = playLength;
    }

    public String getPlayLength() {
        return playLength;
    }

    public void setBookSize(String bookSize) {
        this.bookSize = bookSize;
    }

    public String getBookSize() {
        return bookSize;
    }
}
