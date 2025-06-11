import java.util.Scanner;

public class NumberDifference {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int number1 = input.nextInt();

	System.out.print("Enter second integer: ");
	int number2 = input.nextInt();

	if (number1 > number2){
	System.out.print("Output: %d", (number1 - number2));
	}
	}
}