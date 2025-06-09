import java.util.Scanner;

public class SumOfEvenAndOddIntegers {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int number = input.nextInt();

	int even = 0;
	int odd = 0;

	while (number != 0) {
	if (number % 2 == 0) {
	even = even + number; // summation of even numbers
	}
	else {
	odd = odd + number; // summation of odd numbers
	}

	System.out.print("Enter another integer and press 0 to stop: ");
	number = input.nextInt();

	}
	System.out.printf("Sum of even numbers: %d%n", even);
	System.out.printf("Sum of odd numbers: %d%n", odd);
	}
}