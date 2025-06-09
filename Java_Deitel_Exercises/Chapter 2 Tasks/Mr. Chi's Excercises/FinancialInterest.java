import java.util.Scanner;

public class FinancialInterest {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter balance: ");
	double balance = input.nextDouble();

	System.out.print("Enter annual interest rate: ");
	double annualInterestRate = input.nextDouble();
	
	int constant = 1200;
	double interest = balance * (annualInterestRate / constant);

	System.out.printf("The interest is %.5f", interest);
	}
}