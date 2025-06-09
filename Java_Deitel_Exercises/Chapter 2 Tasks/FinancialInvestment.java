import java.util.Scanner;

public class FinancialInvestment {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter investment amount: ");
	double investmentAmount = input.nextDouble();

	System.out.print("Enter your annual interest rate in percentage: ");
	double percentageAnnualRate = input.nextDouble();

	System.out.print("Enter number of years: ");
	double numberOfYears = input.nextDouble();

	double constant = 12;
	double years = numberOfYears * constant;
	double annualRate = percentageAnnualRate / 100;
	double monthlyInterestRate = annualRate / constant;	
	double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), years);

	System.out.printf("Accumulated value is $%.2f", futureInvestmentValue);
	}
}