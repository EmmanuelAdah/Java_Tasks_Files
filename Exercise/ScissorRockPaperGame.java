import java.util.Scanner;
import java.util.Random;

public class  ScissorRockPaperGame{

	public static void main(String[] args){
	
	Random random = new Random();
	int randomNumber = (int) ((Math.random() * 2) + 0);

	Scanner imma = new Scanner(System.in);

	int scissor = 0; 
	int rock = 1;
	int paper = 2;

	int counter = 0;
	int computerWin = 1;
	int userWin = 0;

	int randomDiff = (computerWin - userWin);
	int userDiff = (userWin - computerWin);
	int diff = randomDiff - userDiff;
	
	System.out.print("welcome to Scissor_Rock_Paper Game. \nEnter 0 for Scissor, 1 for Rock or 2 for Paper: ");
	int userInput = imma.nextInt();

	while (computerWin != 2){
	System.out.print("Try again: ");
	userInput = imma.nextInt();
	computerWin += 1;
	counter += 1;

	if (userInput == randomNumber && diff != 2){
	userWin += 1;
	randomNumber = (int) ((Math.random() * 2) + 0);
	System.out.print("1 win. Play again until you have wins 2 ahead: ");
	userInput = imma.nextInt();
	diff = 0;
		if (randomDiff == 2 && userDiff != 2){
		System.out.print("Computer Won");
		}
	}

		if (userDiff == 2 && randomDiff != 2) {
		System.out.printf("Congratulations.%n You Won");
		}
	}

}
}