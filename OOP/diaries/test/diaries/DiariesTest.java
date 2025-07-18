package diaries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        System.out.println(diaries.findByUserName("Adah02"));
    }

    @Test
    public void deleteDiaryTest(){
        diaries.add("Adah02", "trey5");
        diaries.delete("Adah02", "trey4");
        assertTrue(diaries.diaryIsEmpty());
    }
}
