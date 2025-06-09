public class PyramidOfGiza{

	public static void main(String[] args){

	double minutesPerDay = (60 * 24); 
	double minutesPerYear = (minutesPerDay * 365);
	double minutes_in_20_years = (minutesPerYear * 20);
	double hoursPerYear = (24 * 365);
	double tonsPerStone = 2.5;
	double totalNumberOfStones = 2300000;
	double totalNumberOfYears = 20;
	double totalWeightInTons = (tonsPerStone * totalNumberOfStones);

	double totalWeightPerMinute = (minutes_in_20_years / totalWeightInTons);
	double totalWeightPerHour = (totalWeightPerMinute * 60);
	double totalWeightPerYear = ((totalWeightPerHour * 24) * 360);

	System.out.println("The weight of 'The pyramid of giza' on a 24 hour basis for 20 years");
	System.out.printf("The weight per minute is %.2f tons.%n", totalWeightPerMinute);
	System.out.printf("The weight per hour is %.2f tons.%n", totalWeightPerHour);
	System.out.printf("The weight per year is %.2f tons.%n", totalWeightPerYear);

	}

}