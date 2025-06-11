import java.util.Scanner;

public class IntegerDifference {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int number1 = input.nextInt();

	System.out.print("Enter second number: ");
	int number2 = input.nextInt();

	if (number1 > number2){
	System.out.printf("Result: %d", number1);
	}
	if (number2 > number1){
	System.out.printf("Result: %d", number2);
	}
	if (number1 == number2){
	double remainder = (double)number1 % 6;
	
	System.out.printf("Result: %d", remainder);
	}
}
}