import java.util.Scanner;

public class ArithmeticDifference {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter First Integer: ");
	int number1 = input.nextInt();

	System.out.print("Enter Second Integer: ");
	int number2 = input.nextInt();

	System.out.print("Enter Third Integer: ");
	int number3 = input.nextInt();

	System.out.printf("Sum of Integers: %d%n", number1 + number2 + number3);
	System.out.printf("Average of Integers: %d%n", (number1 + number2 + number3) / 3);
	System.out.printf("Product of Integers: %d%n", number1 * number2 * number3);

	if (number1 > number2 && number1 > number3){
	System.out.println("First integer is the largest");
	}
	if (number2 > number1 && number2 > number3){
	System.out.println("Second integer is the largest");
	}
	if (number3 > number1 && number3 > number2){
	System.out.println("Third integer is the largest");
	}

	if (number1 < number2 && number1 < number3){
	System.out.println("First integer is the smallest");
	}
	if (number2 < number1 && number2 < number3){
	System.out.println("Second integer is the smallest");
	}
	if (number3 < number1 && number3 < number2){
	System.out.println("Third integer is the smallest");
	}

	}
}