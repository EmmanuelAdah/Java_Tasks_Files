import java.util.Scanner;
public class ArrayPracticeTest {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	ArrayPractice array = new ArrayPractice();

	System.out.print("Enter number count: ");
	int numberCount = input.nextInt();

	double[] numbers = new double[numberCount];

	for (int k = 0; k < numberCount; k++){
	double numbers[k] = input.nextDoble();
	}
	array.addition(numbers);

	}

}