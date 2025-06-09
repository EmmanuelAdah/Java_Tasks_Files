import java.util.Scanner;
public class StudentScores {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter number of students: ");
	int studentNum = input.nextInt();

	int number;

	int counter = 0;
	int score = 0;
	String name = studentName;

	while (counter != studentNum){
	System.out.print("Enter name of student: ");
	studentName = input.next();

	System.out.print("Enter number of student: ");
	number = input.nextInt();

	counter +=1;
	if (number > score){
	score = number;
	name = studentName;
	}

	}
	System.out.printf("%d. %s has the highest score, which is %d%n", name, score);
	}
}
