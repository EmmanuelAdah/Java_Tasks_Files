import java.util.Scanner;

public class WorldPopulationGrowth {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter current population: ");
	double currentPopulation = input.nextDouble();

	System.out.print("Enter annual growth rate: ");
	double percentageGrowthRate = input.nextDouble();

	double futurePopulation = currentPopulation * (1 + (percentageGrowthRate / 100));
	double populationDifference = futurePopulation - currentPopulation;

	System.out.printf("Population Growth Difference in one year: %.0f%n", populationDifference);

	System.out.printf("Population Growth in one year: %.0f%n", futurePopulation);
	System.out.printf("Population Growth in two years: %.0f%n", futurePopulation + populationDifference);
	System.out.printf("Population Growth in three years: %.0f%n", futurePopulation + (populationDifference * 2));
	System.out.printf("Population Growth in four years: %.0f%n", futurePopulation + (populationDifference * 3));
	System.out.printf("Population Growth in four years: %.0f%n", futurePopulation + (populationDifference * 4));

	}
}