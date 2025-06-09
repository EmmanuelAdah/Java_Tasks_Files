import java.util.Scanner;
public class FactorOfInteger {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter number: ");
	int number = input.nextInt();

	System.out.print("The Factors of " + number + " are: ");

	for (int i = 1; i <= number; i++)
	if (number % i == 0){
	System.out.print(i + " ");
	}

	}
}