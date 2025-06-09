import java.util.Scanner;
public class LargestAndSmallestNumbers {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter numbers. type 0 to stop: ");
	int userInput = input.nextInt();

	int largest = userInput;
	int smallest = userInput;

	while (userInput != 0){
	System.out.print("Enter number: ");
	userInput = input.nextInt();
	
	if (userInput > largest) largest = userInput;
	if (userInput < smallest && userInput > 0) smallest = userInput;
	}
	System.out.println("Largest value is "+ largest);
	System.out.println("Smallest value is "+ smallest);

}
}