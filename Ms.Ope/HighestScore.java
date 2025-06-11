import java.util.Scanner;
public class HighestScore {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Type i and -1 to stop. \nEnter name of student: ");
	String studentName = input.next();

	System.out.print("Enter student's score: ");
	int number = input.nextInt();

	int counter = 0;
	int score = 0;
	String name = studentName;

	while (number != -1 && studentName != "i"){
	counter +=1;
	if (number > score){
	score = number;
	name = studentName;
	}

	System.out.print("Enter name of student: ");
	studentName = input.next();

	System.out.print("Enter number of student: ");
	number = input.nextInt();
	}
	System.out.printf(" %s has the highest score, which is %d%n", name, score);
	}
}
