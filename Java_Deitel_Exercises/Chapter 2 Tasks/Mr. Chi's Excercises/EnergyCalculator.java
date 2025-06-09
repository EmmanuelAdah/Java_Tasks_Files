import java.util.Scanner;

public class EnergyCalculator {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the amount of water in kilogram: ");
	double waterWeight = input.nextDouble();

	System.out.print("Enter the initial temperature of water: ");
	double initialTemperature = input.nextDouble();

	System.out.print("Enter the final temperature of water: ");
	double finalTemperature = input.nextDouble();
	
	double constant = 4184;
	double energyNeeded = waterWeight * (finalTemperature - initialTemperature) * constant;

	System.out.printf("The energy needed is %.1f", energyNeeded);
	}
}