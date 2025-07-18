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

    @Test
    public void entryIsEmptyTest(){
        assertTrue(diary.entryIsEmpty());
    }

    @Test
    public void entryIsNotEmptyTest(){
        diary.createEntry(1704, "Adah02", "trey5");
        assertFalse(diary.entryIsEmpty());
    }

    @Test
    public void deleteEntryTest(){
        diary.createEntry(1704, "Adah02", "trey5");
        diary.deleteEntry(1704);
        assertTrue(diary.entryIsEmpty());
    }

    @Test
    public void deleteEntryFailedTest2(){
        diary.createEntry(1704, "Adah02", "trey5");
        diary.deleteEntry(1701);
        assertFalse(diary.entryIsEmpty());
    }
}