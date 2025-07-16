package diaries;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<Diary> diaries;

    public void add(String userName, String password){
        this.diaries.add(new Diary(userName, password));
    }
}
