import java.util.Random;
import java.util.Scanner;

public class MystryGame {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Guess my number. Type between 1 and 10: ");
	int myNumber = input.nextInt();

	Random random = new Random();
	int randomNumber = (int)((Math.random() * 10) + 1);

	if (myNumber == randomNumber){
	System.out.println("correct");
	}
	else if (myNumber > 10) {
	System.out.print("Invalid input");
	}
	else if (myNumber < 1) {
	System.out.print("Invalid input");
	}
	else if (myNumber > randomNumber){
	System.out.println("Input is Higher than the number");
	System.out.print("Try again: ");
	int number1 = input.nextInt();
		if (number1 == randomNumber){
		System.out.println("Correct");
		}
		else if (number1 > 10){
		System.out.println("Invalid input");
		}
		else if (number1 < 1){
		System.out.println("Invalid input");
		}
		else if (number1 > randomNumber){
		System.out.println("Input is Higher than the number");
		System.out.print("Try again: ");
		int number3 = input.nextInt();
			if (number3 == randomNumber){
			System.out.println("Correct");
			}
			else if (number3 > 10){
			System.out.println("Invalid input");
			}
			else if (number3 < 1){
			System.out.println("Invalid input");
			}
			else {
				System.out.print("Game Over");
			}
		}
		else if (number1 < randomNumber){
		System.out.println("Input is Lower than the number");
		System.out.print("Try again: ");
		int number3 = input.nextInt();
		
			if (number3 == randomNumber){
			System.out.println("Correct");
			}
			else if (number3 > 10){
			System.out.println("Invalid input");
			}
			else if (number3 < 1){
			System.out.println("Invalid input");
			}
			else {
				System.out.print("Game Over");
			}
		}
		
	}
	else if (myNumber < randomNumber){
	System.out.println("Input is Lower than the number");
	System.out.print("Try again: ");
	int number2 = input.nextInt();
		if (number2 == randomNumber){
		System.out.println("Correct");
		}
		else if (number2 > 10){
		System.out.println("Invalid input");
		}
		else if (number2 < 1){
		System.out.println("Invalid input");
		}
		else if (number2 > randomNumber){
		System.out.println("Input is Higher than the number");
		System.out.print("Try again: ");
		int number5 = input.nextInt();
			if (number5 == randomNumber){
			System.out.println("Correct");
			}
			else if (number5 > 10){
			System.out.println("Invalid input");
			}
			else if (number5 < 1){
			System.out.println("Invalid input");
			}
			else {
			System.out.print("Game Over");
			}
		}
		else if (number2 < randomNumber){
		System.out.println("Input is Lower than the number");
		System.out.print("Try again: ");
		int number5 = input.nextInt();

			if (number5 == randomNumber){
			System.out.println("Correct");
			}
			else if (number5 > 10){
			System.out.println("Invalid input");
			}
			else if (number5 < 1){
			System.out.println("Invalid input");
			}
			else {
			System.out.print("Game Over");
			}
		}
		
	}

	}
}