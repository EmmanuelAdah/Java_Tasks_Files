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
        diaries.add("Adah02", "trey5");
        assertFalse(diaries.diaryIsEmpty());
    }

    @Test
    public void findDiaryByUsernameTest(){
        diaries.add("Adah01", "trey7");
        diaries.add("Adah02", "trey5");
        assertEquals("Username: Adah02", diaries.findByUserName("Adah02").toString());
    }

    @Test
    public void deleteDiaryWithCorrectPasswordTest(){
        diaries.add("Adah02", "trey5");
        diaries.delete("Adah02", "trey5");
        assertTrue(diaries.diaryIsEmpty());

        diaries.add("Adah02", "trey5");
        diaries.add("Adah03", "trey6");
        diaries.delete("Adah02", "trey5");
        assertFalse(diaries.diaryIsEmpty());
    }

    @Test
    public void deleteDiaryWithWrongPasswordTest(){
        diaries.add("Adah02", "trey5");
        diaries.delete("Adah02", "trey6");
        assertFalse(diaries.diaryIsEmpty());

        diaries.add("Eliot", "ellie");
        diaries.delete("Eliot", "elliE");
        assertFalse(diaries.diaryIsEmpty());

        diaries.add("John", "john");
        diaries.delete("John", "John");
        assertFalse(diaries.diaryIsEmpty());
    }
}
