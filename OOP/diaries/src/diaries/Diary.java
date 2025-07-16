package diaries;

import java.util.List;

public class Diary {
    private String userName;
    private String password;
    private boolean isLocked;
    private List<Entry> entries;

    public Diary(String userName, String password){
        validateUserName(userName);
        this.userName = userName;
    }

    public void validateUserName(String userName) {
        if (userName.length() < 4 || userName.length() > 20) throw new InvalidUserNameLengthException("Username must be between 4 and 20");
        this.userName = userName;
    }
}
