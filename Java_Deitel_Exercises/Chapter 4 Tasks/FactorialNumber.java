import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int userInput = input.nextInt();

	int factorial = 1;

	for (int i = 1; i <= userInput; ++i){
	factorial *= i;
	} 

	System.out.printf("The factorial of %d is %d%n", userInput, factorial);
	}
}