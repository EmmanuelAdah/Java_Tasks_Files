import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter First Integer: ");
	int number1 = input.nextInt();

	System.out.print("Enter Second Integer: ");
	int number2 = input.nextInt();

	int squareNumber1 = number1 * number1;
	int squareNumber2 = number2 * number2;

	System.out.printf("Square of First Integer: %d%n", squareNumber1);
	System.out.printf("Square of Second Integer: %d%n", squareNumber2);

	System.out.printf("Square Difference: %d%n", squareNumber1 - squareNumber2);

	}
}