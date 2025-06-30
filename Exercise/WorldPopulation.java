import java.util.Scanner;

public class WorldPopulation {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter current population: ");
	double currentPopulation = input.nextDouble();

	System.out.print("Enter annual growth rate: ");
	double percentageGrowthRate = input.nextDouble();

	final int PERCENTAGE = 100;
	double actualGrowthRate = (PERCENTAGE / currentPopulation) * percentageGrowthRate;

	double futurePopulation = currentPopulation * (1 + actualGrowthRate);

	System.out.printf("Population in a year at %.1f%% is %.0f", percentageGrowthRate, futurePopulation);

	}
}