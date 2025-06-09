import java.util.Scanner;

public class ThreeDivisible {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number: ");
	int number = input.nextInt();

	if (number % 3 == 0){
	System.out.printf(" %d is divisible by 3", number);
	}
	if (number % 3 != 0){
	System.out.printf(" %d is not divisible by 3", number);
	}
	}

}