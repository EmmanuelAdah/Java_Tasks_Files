import java.util.Scanner;

public class Acceleration {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your starting velocity (meters/seconds): ");
	double v0 = input.nextDouble();

	System.out.print("Enter your ending velocity (meters/seconds): ");
	double v1 = input.nextDouble();

	System.out.print("Enter the time taken (in seconds): ");
	double t = input.nextDouble();

	double acceleration = (v1 - v0) / t;

	System.out.printf("Average Acceleration: %.4f", acceleration);
	}
}