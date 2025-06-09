import java.util.Scanner;

public class ComparingIntegers {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Integer: ");
	int number = input.nextInt();
	
	int squareNumber = number * number;
	int numberAndSquare = number + squareNumber;
	
	if(numberAndSquare > 100){
	System.out.printf("%d > %d%n", number + squareNumber, 100);
	}
	if(numberAndSquare == 100){
	System.out.printf("%d == %d%n", number + squareNumber, 100);
	}
	if(numberAndSquare != 100){
	System.out.printf("%d != %d%n", number + squareNumber, 100);
	}
	if(numberAndSquare < 100){
	System.out.printf("%d < %d%n", number + squareNumber, 100);
	}
}
}