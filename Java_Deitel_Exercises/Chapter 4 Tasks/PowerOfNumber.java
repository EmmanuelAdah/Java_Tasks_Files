import java.util.Scanner;
public class PowerOfNumber {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter base number: ");
	int baseNumber = input.nextInt();

	System.out.print("Enter the power: ");
	int power = input.nextInt();

	int outcome = 0;
	
	for (int index = 1; index <= power; index++){
	outcome += baseNumber;
	}

	System.out.printf("%d^%d is %d%n", baseNumber, power, outcome);
	}
}