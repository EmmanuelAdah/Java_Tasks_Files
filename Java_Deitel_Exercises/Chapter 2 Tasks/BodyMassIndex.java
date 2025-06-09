import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your wieght in pounds: ");
	double weight = input.nextDouble();

	System.out.print("Enter height in inches: ");
	double height = input.nextDouble();
	
	double pound = 0.45359237;
	double kilogram = 0.0254;
	double kilogramWeight = weight * pound;
	double inchHeight = height * kilogram;
	
	double bmi = kilogramWeight / (inchHeight * inchHeight);

	System.out.printf("BMI is %.4f", bmi);
	}
}