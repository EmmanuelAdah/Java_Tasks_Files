import java.util.Scanner;
public class TwoHighestScores {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter name of student: ");
	String studentName = input.next();

	System.out.print("Enter student's score: ");
	int number = input.nextInt();

	int score = 0;
	int secondHigh =0;
	String name = studentName;
	String secondName = studentName;

	while (number != -1 && studentName != "i"){
	if (number > score){
	score = number;
	name = studentName;
	}
	else if (number > secondHigh){
	secondHigh = number;
	secondName = studentName;
	}
	System.out.print("Enter name of student: ");
	studentName = input.next();

	System.out.print("Enter student's score: ");
	number = input.nextInt();

	}
	System.out.printf("%s scored highest: %d %n%s scored second highest: %d%n", name, score, secondName, secondHigh);
	}
}
