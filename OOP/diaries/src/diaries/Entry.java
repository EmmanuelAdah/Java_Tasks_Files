package diaries;

import java.time.LocalDateTime;

public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated = LocalDateTime.now();

    public Entry(String title, String body) {
        this.title = title;
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