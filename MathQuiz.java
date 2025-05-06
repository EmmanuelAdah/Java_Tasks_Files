import java.util.Scanner;
public class MathQuiz {

	public static void main(String[] args){

	Scanner munchies = new Scanner(System.in);

	Munchies quiz = new Munchies();

	System.out.print("Enter an integer: ");
	int userInput = munchies.nextInt(); 

	quiz.fifthMultiple(5);

	quiz.ageYears(4);

	quiz.primeNumber();

	quiz.findMultiplesOf7Not5();

	quiz.dogAge("Doggy",4);

	quiz.sumOfNumbers(2342);
	}

}

