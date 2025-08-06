package diaries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiariesTest {
    Diaries diaries = new Diaries();

    @Test
    public void diaryIsEmptyTest(){
        assertTrue(diaries.diaryIsEmpty());
    }

    @Test
    public void diaryIsNotEmptyTest(){
        diaries.createDiary("Adah02", "trey5");
        assertFalse(diaries.diaryIsEmpty());
    }

    @Test
    public void findDiaryByUsernameTest(){
        diaries.createDiary("Adah01", "trey7");
        diaries.createDiary("Adah02", "trey5");
        assertEquals("Username: Adah02", diaries.findByUserName("Adah02").toString());
    }

    @Test
    public void deleteDiaryWithCorrectPasswordTest(){
        diaries.createDiary("Adah02", "trey5");
        diaries.deleteDiary("Adah02", "trey5");
        assertTrue(diaries.diaryIsEmpty());

        diaries.createDiary("Adah02", "trey5");
        diaries.createDiary("Adah03", "trey6");
        diaries.deleteDiary("Adah02", "trey5");
        assertFalse(diaries.diaryIsEmpty());
    }

    @Test
    public void deleteDiaryWithWrongPasswordTest(){
        diaries.createDiary("Adah02", "trey5");
        assertThrows(NullPointerException.class, () -> diaries.deleteDiary("Adah02", "trey6"));

        diaries.createDiary("Eliot", "ellie");
        assertThrows(NullPointerException.class, () -> diaries.deleteDiary("Eliot", "elliE"));
    }
}
