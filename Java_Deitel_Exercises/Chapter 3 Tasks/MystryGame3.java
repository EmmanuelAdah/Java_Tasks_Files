import java.util.Scanner;
import java.util.Random;

public class MystryGame3 {

	public static void main(String[] args){
	
	Random random = new Random();
	int randomNumber = (int) ((Math.random() * 10) + 1);

	Scanner imma = new Scanner(System.in);

	int counter = 1;
	int trials = 1;
	
	System.out.print("Guess the number, \nEnter a number between 1 and 10: ");
	int userInput = imma.nextInt();

	while (userInput != randomNumber){
		System.out.println("Try again: ");
		userInput = imma.nextInt();
		counter += 1;
		trials ++;

		if (counter == 3 && userInput != randomNumber){
		randomNumber = (int) ((Math.random() * 10) + 1);
		counter = 0;
		System.out.println("The number has changed");
		} 
		if (userInput == randomNumber){
		System.out.printf("%s.%nThe number of guesses: %d", "Congratulations",(trials));
		} 
		}
	

	}
}