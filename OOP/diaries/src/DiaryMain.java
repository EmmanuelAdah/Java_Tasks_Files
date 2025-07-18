import diaries.Diaries;
import diaries.Diary;
import diaries.Entry;

public class DiaryMain {
    public static void main(String[] args) {

        Diary ent = new Diary("userName", "passKey");
        Diaries diary = new Diaries();
        diary.add("userName", "password");
        ent.createEntry(1996, "Emma", "Adah02");
        ent.createEntry(2443, "userName", "password");
        ent.deleteEntry(2443);

        for (Entry entry : ent.getEntry()) {
            System.out.println(entry);
        }
    }
}