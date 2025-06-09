import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	MultiplicationKata quiz = new MultiplicationKata();

	System.out.print("Enter your start point: ");
	int startPoint = input.nextInt();

	System.out.print("Enter your end point: ");
	int endPoint = input.nextInt();

	quiz.multiplication(startPoint, endPoint);
	}

} 