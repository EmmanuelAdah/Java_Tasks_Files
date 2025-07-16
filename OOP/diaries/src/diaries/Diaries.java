package diaries;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Diaries {
    private List<Diary> diaries;

    public void add(String userName, String password){
        this.diaries.add(new Diary(userName, password));
    }

    void findByUserName(String userName){
        for (Diary diary : this.diaries) {
            if (Objects.equals(diary[0], userName)) return diary[0];
        }
    }
}
