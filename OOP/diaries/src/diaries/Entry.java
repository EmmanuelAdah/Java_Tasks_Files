package diaries;

import java.time.LocalDateTime;

public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated = LocalDateTime.now();

    public Entry(String title, String body) {
        validateTitle(title);
        this.title = title;
        this.body = body;
    }

    private void validateTitle(String title) {
        if (title.length() > 30) throw new IllegalArgumentException("Title length exceeds 30 characters");
        this.title = title;
    }

    private void validateId(int id) {
        if (id < 0) throw new IllegalArgumentException("ID cannot be negative");
        this.id = id;
    }

    void setTitle(String title) {
        validateTitle(title);
        this.title = title;
    }

    void setId(int userID) {
        validateId(userID);
        this.id = userID;
    }

    void setBody(String body) {
        this.body = body;
    }

    String getDateCreated() {
        return dateCreated.toString();
    }

    String getTitle() {
        return title;
    }

    String getBody() {
        return body;
    }
}