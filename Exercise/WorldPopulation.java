import java.util.Scanner;

public class WorldPopulation {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter current population: ");
	double currentPopulation = input.nextDouble();

	System.out.print("Enter annual growth rate: ");
	double percentageGrowthRate = input.nextDouble();

	double futurePopulation = currentPopulation * (1 + percentageGrowthRate / 100);
	double populationDifference = futurePopulation - currentPopulation;

	double initialPopulation = currentNumber - growthRate;
	double annualPopulationGrowthRate = currentNumber - (initialPopulation / initialPopulation * 100);

	System.out.print("your annual growth rate is : " + " " + annualPopulationGrowthRate);

	}
}