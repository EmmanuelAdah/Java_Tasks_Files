import java.util.Scanner;

public class SumOfDigitsInInteger {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int number = input.nextInt();
	
	int firstDigit = number / 100;
	int secondDigit = (number % 100) / 10;
	int thirdDigit = number % 10;

	int sum = firstDigit + secondDigit + thirdDigit;

	if (number > 1000){
	System.out.print("input is invalid");
	}
	if (number < 0){
	System.out.print("input is invalid");
	}
	System.out.printf("%d", sum);
	
	}
}