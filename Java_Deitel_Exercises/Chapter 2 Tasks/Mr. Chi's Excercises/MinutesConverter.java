import java.util.Scanner;

public class MinutesConverter {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the number of minutes: ");
	double minutes = input.nextDouble();
	
	double dailyConstant = 1440;
	double yearlyConstant = 525600;
	
	double days = minutes / dailyConstant;
	double years = minutes / yearlyConstant;
	double remainder = minutes % yearlyConstant;
	double dayRemains = remainder / dailyConstant;
	double year = (int)years;

	System.out.printf("%.0f minutes is approximately %.0f years and %.0f days", minutes, year, dayRemains);
	}
}