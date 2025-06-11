import java.util.Scanner;
public class MinAndMaxIntegerDifference {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int firstInteger = input.nextInt();
	
	System.out.print("Enter second integer: ");
	int secondInteger = input.nextInt();

	System.out.println("Expected Output:");
	System.out.printf("Sum of two integers: %d%n", (firstInteger + secondInteger));
	System.out.printf("product of two integers: %d%n", (firstInteger * secondInteger));
	System.out.printf("Average of two integers: %d%n", (firstInteger + secondInteger / 2));
	System.out.printf("Distance of two integers: %d%n", (firstInteger - secondInteger));

		if (firstInteger > secondInteger){
		System.out.printf("Max integer: %d%n", firstInteger);
		}
		if (firstInteger < secondInteger) {
		System.out.printf("Min integer: %d%n", firstInteger);
		}
		if (secondInteger > firstInteger){
		System.out.printf("Max integer: %d%n", secondInteger);
		}
		if (secondInteger < firstInteger) {
		System.out.printf("Min integer: %d%n", secondInteger);
		}
	
	}
}