package book;

public class AudioBook extends Book{
    private String artistName;
    private float bookSize;
    private String playLength;

    public AudioBook(String bookTitle, String bookAuthor, String artistName, float bookSize, String playLength) {
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

    public void setBookSize(float bookSize) {
        this.bookSize = bookSize;
    }

    public String getBookSize() {
        return String.format("%.1f MB", bookSize);
    }

    @Override
    public String toString() {
        return String.format("Book Tittle: %s %nBook Author: %s %nArtist Name: %s %nBook Size: %s %nPlay Length: %s%n", getBookTitle(), getBookAuthor(), getArtistName(), getBookSize(), getPlayLength());
    }
}