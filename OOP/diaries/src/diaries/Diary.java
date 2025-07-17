package diaries;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Diary {
    private String userName;
    private String password;
    private boolean isLocked;
    private List<Entry> entries = new ArrayList<>();

    public Diary(String userName, String password){
        validateUserName(userName);
        this.userName = userName;
        validatePassword(password);
        this.password = password;
    }

    private void validateUserName(String userName) {
        if (userName.length() < 4 || userName.length() > 20) throw new InvalidUserNameLengthException("Username must be between 4 and 20");
        this.userName = userName;
    }

    private void validatePassword(String password) {
        if (password.length() > 16 || password.length() < 4) throw new InvalidPasswordLengthException("Password must be between 4 and 16");
        this.password = password;
    }

    void unlockDiary(String passKey) {
        isLocked = !password.equals(passKey);
    }

    void lockDiary() {
        this.isLocked = true;
    }

    boolean isLocked() {
        return isLocked;
    }

    public void createEntry(int userID, String userName, String password) {
        this.entries.add(new Entry(userID, userName, password));
    }

    public void deleteEntry(int userId) {
        for (Entry entry : entries) {
            this.entries.removeIf(id -> Objects.equals(entry.getId(), userId));
        }
    }

    boolean entryIsEmpty(){
        return this.entries.isEmpty();
    }

    public List<Entry> getEntry(){
        return this.entries;
    }

    public String getUserName(){
        return this.userName;
    }

    public String toString(){
        return String.format("Username: %s, Password: %s", userName, password);
    }
}