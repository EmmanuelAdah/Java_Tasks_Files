import java.util.Scanner;
public class LoanAmortizationSchedule {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter loan amount: ");
	int loanAmount = input.nextInt();

	System.out.print("Enter the number of years: ");
	int numberOfYears = input.nextInt();

	System.out.print("Enter percentage rate: ");
	int percentageRate = input.nextInt();

	final double PERCENTAGE = 100;
	final double MONTHS_PER_YEAR = 12;
	double actual_rate = (percentageRate / PERCENTAGE);

	double annualInterest = loanAmount * (Math.pow(1 + actual_rate,numberOfYears));

	System.out.print(annualInterest);
	}
}