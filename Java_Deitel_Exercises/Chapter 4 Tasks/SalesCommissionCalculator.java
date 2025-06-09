import java.util.Scanner;

public class PercentageCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	System.out.println("Type -1 to stop");
	System.out.print("Enter price of item 1: ");
	double userInput = input.nextDouble();

	double totalAmount = userInput;
	int numberOfItems = 0;
	
	while (userInput != -1){
	numberOfItems++;
	System.out.printf("Enter price of item %d: ", (numberOfItems +1));
	userInput = input.nextDouble();
	totalAmount += userInput;
	}

	double constantWeeklyCommission = 200;
	double percentageCommission = (9.00 / 100);
	double commissionFromSales = (totalAmount * percentageCommission);
	double totalCommission = constantWeeklyCommission + commissionFromSales;

	System.out.printf("Your total commission for the week is $%.2f%nFor %d items.", totalCommission, numberOfItems);
	}
}