import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter integers: ");
	int userInput = input.nextInt();

	int number = userInput;
	int remainder = 0;
	int reverse = 0;

	while (number != 0){
	
	remainder = number % 10;
	reverse += remainder;
	reverse *= 10;
	number = number / 10;
	}

	int reversedNumber = (reverse /10);
	
	if (userInput == reversedNumber){
		System.out.print( reversedNumber + " is a palindrome");
	}
	else{
		System.out.print(reversedNumber + " is not a palindrome");
	}
	
	}
}