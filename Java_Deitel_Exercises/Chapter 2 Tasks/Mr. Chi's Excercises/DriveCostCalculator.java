import java.util.Scanner;

public class DriveCostCalculator {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the distance to drive in mile(s): ");
	double distance = input.nextDouble();

	System.out.print("Enter fuel efficiency of car in miles per gallon: ");
	double fuelConsumption = input.nextDouble();

	System.out.print("Enter fuel price per gallon ($): ");
	double fuelPrice = input.nextDouble();
	
	double constant = 100;
	double fuelCost = (distance * fuelConsumption) / (constant * fuelPrice);

	System.out.printf("The cost of driving is $%.2f", fuelCost);
	}
}