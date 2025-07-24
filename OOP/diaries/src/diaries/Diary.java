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
        if (userName.length() < 4 || userName.length() > 20)
            throw new InvalidUserNameLengthException("Username must be between 4 and 20 characters");
        this.userName = userName;
    }

    private void validatePassword(String password) {
        if (password.length() < 4 || password.length() > 16)
            throw new InvalidPasswordLengthException("Password must be between 4 and 16 characters");
        this.password = password;
    }

    void unlockDiary(String passKey) {
        this.isLocked = !password.equals(passKey);
    }

    void lockDiary() {
        this.isLocked = true;
    }

    boolean isLocked() {
        return this.isLocked;
    }

    public void createEntry(int userID, String title, String body) {
        this.entries.add(new Entry(userID, title, body));
    }

    public void deleteEntry(int userId) {
        boolean isFound = false;
        for (Entry entry : this.entries) {
            if (Objects.equals(entry.getId(), userId)) {
                this.entries.remove(entry);
                isFound = true;
            }
            if (!isFound) throw new IdentityMismatchException("User ID not found");
            else break;
        }
    }

    public Entry findEntryByUserId(int userID) {
        for (Entry entry : this.entries) {
            if (Objects.equals(entry.getId(), userID)) return entry;
        }
        return null;
    }

    boolean entryIsEmpty(){
        return this.entries.isEmpty();
    }

    public String getUserName(){
        return this.userName;
    }

    public List<Entry> getEntry(){
        return this.entries;
    }

    public String toString(){
        return String.format("Username: %s", getUserName());
    }
}