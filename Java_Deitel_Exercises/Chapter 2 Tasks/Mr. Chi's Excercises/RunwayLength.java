import java.util.Scanner;

public class RunwayLength {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter velocity in meters/seconds: ");
	double velocity = input.nextDouble();

	System.out.print("Enter acceleration in meters/seconds squared: ");
	double acceleration = input.nextDouble();
	
	double constant = 2;
	double length = (velocity * velocity) / (acceleration * constant);

	System.out.printf("The minimum runway length for this airplane is %.3f", length);
	}
}