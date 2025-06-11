import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class LargestElementsTest{

	LargestElements quiz = new LargestElements();

	@Test
	public void testForLragestNumberInAnArray(){

	double[][] check = {{5,7,3},{8,9,1}};
	int[] expected = {1,1};

	assertArrayEquals(quiz.isElements(check), expected);




	}

}