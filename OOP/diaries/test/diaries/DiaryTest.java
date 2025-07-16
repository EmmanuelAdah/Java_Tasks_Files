package diaries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiaryTest {
    Diary diary = new Diary("Adah02", "trey5");

    @Test
    public void diaryIsLockedTest(){
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    public void diaryIsUnlockedTest(){
        diary.unlockDiary("trey5");
        assertFalse(diary.isLocked());
    }


}
