import java.util.Scanner;
public class ContinuousWorldPopulationGrowth {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter current population: ");
	double currentPopulation = input.nextDouble();

	System.out.print("Enter growth rate percentage: ");
	double growthRate = input.nextDouble();	

	double futurePopulation = currentPopulation * (1 + (growthRate / 100));
	double difference = (futurePopulation - currentPopulation);

	double population = futurePopulation;
	
	for (int counter =1; counter < 76; counter++){
		population += difference;
		System.out.println(counter + " " + (int)population);
		}
	}
}