import java.util.Scanner;

public class PoundsToKilogramConverter {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter weight in pounds: ");
	double poundWeight = input.nextDouble();
	
	double constant = 0.454;
	double kilogram = poundWeight * constant;

	System.out.printf("%.1f pound is %.3f kilograms", poundWeight, kilogram);
	}
}