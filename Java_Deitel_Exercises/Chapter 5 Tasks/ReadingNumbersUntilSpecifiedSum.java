import java.util.Scanner;

public class ReadingNumbersUntilSpecifiedSum {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your limit: ");
	double limit = input.nextDouble();

	double userInput = 0;
	double total = 0;
	double difference = 0;

	while (userInput != -1 && total < limit){
	if (total != limit){
	System.out.print("Enter input: ");
	userInput = input.nextDouble();
	total += userInput;
	difference = limit - total;
	}
	System.out.println("Total is "+ total);
	System.out.println("The remaining amount is "+ difference);
	}
	
	}
}