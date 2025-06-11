import java.util.Scanner;
public class BinaryNumber {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int userInput = input.nextInt();

	System.out.print("The binary of " + userInput + "is " );

	int binary = 0;

	for (int i = 10; i <= userInput; i++){
		if (userInput % i == 0);
		System.out.print(i + " ");
	}


	}
}