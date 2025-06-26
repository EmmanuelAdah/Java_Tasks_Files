import java.util.Scanner;

public class GasMileages {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	double milesDriven = 0;
	double totalGallonsUsed = 0;
	double totalMilesDriven = 0;

	while (milesDriven != -1){

	System.out.print("Enter miles driven. type -1 to stop: ");
	milesDriven = input.nextDouble();
	totalMilesDriven += milesDriven;

	System.out.print("Enter gallons used: ");
	double gallonsUsed = input.nextDouble();
	totalGallonsUsed += gallonsUsed;
	}
	double milesPerGallon = totalMilesDriven / totalGallonsUsed;

	System.out.printf("Miles per Gallon %.2f", milesPerGallon);
	}
}