import java.util.Scanner;
public class Average {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter integer. Type 0 to stop entry: ");
	int userInput = input.nextInt();;

	int counter = 0;
	int positive = 0;
	int negative = 0;
	double total = 0;

	while (userInput != 0){
		total += userInput;
		if (userInput > 0){
		positive +=1;
		counter++;
		System.out.println("Enter integer: ");
		userInput = input.nextInt();
		}
		else if (userInput < 0){
		negative +=1;
		counter++;
		System.out.println("Enter integer: ");
		userInput = input.nextInt();
		}
		
	}	
	double average = (double) total / counter;

	System.out.printf("The number of positives is %d%nThe number of negatives is %d%nThe total is %.1f%nThe average is %.2f%n", positive, negative, total, average);

	}

}