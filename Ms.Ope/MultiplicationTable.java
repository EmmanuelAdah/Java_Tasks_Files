import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int userInput = input.nextInt();

	System.out.printf("Multiple of %d%n", userInput);

	for (int i = 1; i <= 12; i++)
	System.out.println( i +" "+ "*"+ " " + userInput + " "+ "=" + " "+ i * userInput);


	}
}