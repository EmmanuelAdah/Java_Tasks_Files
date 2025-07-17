package diaries;

import java.util.List;
import java.util.Objects;

public class Diaries {
    private List<Diary> diaries;

    public void add(String userName, String password){
        this.diaries.add(new Diary(userName, password));
    }

    Diary findByUserName(String userName){
        for (Diary diary : this.diaries) {
            if (Objects.equals(diary, userName)) return diary;
        }
        return null;
    }

    void delete(String userName, String passKey){
        Diary dairy = new Diary(userName, passKey);
        dairy.unlockDiary(passKey);
        this.diaries.removeIf(diary -> Objects.equals(diary, userName) && dairy.isLocked());
    }
}
