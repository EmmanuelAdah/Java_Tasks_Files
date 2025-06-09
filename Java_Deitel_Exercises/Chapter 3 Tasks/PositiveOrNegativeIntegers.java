import java.util.Scanner;

public class PositiveOrNegativeIntegers {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter two integers: ");
	int number1 = input.nextInt();
	int number2 = input.nextInt();

	if (number1 >= 0){
		if (number2 >= 0){
		System.out.printf("Outcome: %d%n", (number1 * number2));
		}
	}
	 if (number1 < 0){
		if (number2 < 0){
		System.out.printf("Outcome: %d", (number1 * number2));
		} else {
		System.out.printf("Outcome: %d", (number1 + number2));
		}
		}
	}
}