import java.util.Scanner;
import java.util.Random;

public class MystryGame2 {

	public static void main(String[] args){
	
	Random random = new Random();
	int randomNumber = (int) ((Math.random() * 10) + 1);

	Scanner imma = new Scanner(System.in);

	int counter = 1;
	
	System.out.print("Guess the number, \nEnter a number between 1 and 10: ");
	int userInput = imma.nextInt();

	while ( counter != 3 && userInput != randomNumber){
		System.out.println("Try again: ");
		userInput = imma.nextInt();
		counter += 1;

		if (userInput == randomNumber){
		System.out.printf("%s.%nThe number of guesses: %d", "Congratulations", counter);
		}
		if (counter == 3 && userInput != randomNumber){
		System.out.printf("%s.%nThe number of guesses: %d", "Game Over", counter);
		}

	}

	}
}