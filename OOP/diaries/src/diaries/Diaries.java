package diaries;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Diaries {
    private List<Diary> diaries = new ArrayList<>();

    public void add(String userName, String password){
        this.diaries.add(new Diary(userName, password));
    }

    Diary findByUserName(String userName){
        for (Diary diary : this.diaries) {
            if (Objects.equals(diary.getUserName(), userName)) return diary;
        }
        return null;
    }

    void delete(String userName, String passKey){
        Diary dair = new Diary(userName, passKey);
        dair.unlockDiary(passKey);
        this.diaries.removeIf(diary -> Objects.equals(diary.getUserName(), userName) && dair.isLocked());
    }

    public boolean diaryIsEmpty(){
        return this.diaries.isEmpty();
    }
}