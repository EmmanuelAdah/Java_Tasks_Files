import java.util.Scanner;
public class LargestAndSmallestInteger {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter number. type 0 to stop: ");
	int number = input.nextInt();
	
	int largest = number;
	int smallest = number;
	
	while (number != 0){
	System.out.print("Enter number: ");
	number = input.nextInt();

	if (number > largest) largest = number;
	if (number < smallest && number > 0) smallest = number;
	}
	System.out.println("Largest number is "+ largest);
	System.out.println("Smallest number is "+ smallest);
	}
}