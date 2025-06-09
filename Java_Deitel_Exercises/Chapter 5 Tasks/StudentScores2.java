import java.util.Scanner;
public class StudentScores2 {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter student's name and score. Type 'i' and -1 to stop");

	System.out.print("Enter name of student: ");
	String studentName = input.nextLine();

	System.out.print("Enter student's score: ");
	int studentScore = input.nextInt();

	int highestScore = 0;
	int secondHighest =0;
	String maxName = studentName;
	String secondMaxName = studentName;

	while (studentScore != -1 && studentName != "i"){
	if (studentScore > highestScore){
	secondMaxName = maxName;
	secondHighest = highestScore;

	highestScore = studentScore;
	maxName = studentName;
	}
	else if (studentScore > secondHighest && studentScore < highestScore){
	secondHighest = studentScore;
	secondMaxName = studentName;
	}
	System.out.print("Enter name of student: ");
	studentName = input.next();

	System.out.print("Enter student's score: ");
	studentScore = input.nextInt();

	}
	System.out.printf("%s scored highest: %d %n%s scored second highest: %d%n", maxName, highestScore, secondMaxName, secondHighest);
	}
}
