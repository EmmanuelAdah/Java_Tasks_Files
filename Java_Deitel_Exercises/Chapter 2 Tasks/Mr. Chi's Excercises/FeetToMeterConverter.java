import java.util.Scanner;

public class FeetToMeterConverter {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter distance in feet: ");
	double feet = input.nextDouble();
	
	double constant = 0.305;
	double meter = feet * constant;

	System.out.printf("%.1f feet is %.4f", feet, meter);
	}
}