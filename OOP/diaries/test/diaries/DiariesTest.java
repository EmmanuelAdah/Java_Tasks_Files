package diaries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiariesTest {

    Diaries diaries = new Diaries();

    @Test
    public void diaryIsEmpty(){
        assertTrue(diaries.diaryIsEmpty());
    }

    @Test
    public void diaryIsNotEmpty(){
        diaries.add("Adah02", "trey5");
        assertFalse(diaries.diaryIsEmpty());
    }
}
