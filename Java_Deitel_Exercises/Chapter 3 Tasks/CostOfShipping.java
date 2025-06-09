import java.util.Scanner;

public class CostOfShipping {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter weight of package: ");
	double w = input.nextDouble();

	/*double cost1 = (3.5 * w);
	double cost2 = (5.5 * w);
	double cost3 = (8.5 * w);
	double cost4 = (10.5 * w);*/

	if (0 < w && w <= 1){
	System.out.printf("$%.1f", 3.5);
	}
	if (1 < w && w <= 3){
	System.out.printf("$%.1f", 5.5);
	}
	if (3 < w && w <= 10){
	System.out.printf("$%.1f", 8.5);
	}
	if (10 < w && w <= 20){
	System.out.printf("$%.1f", 10.5);
	}
	if (w > 20){
	System.out.print("The package cannot be shipped");
	}
	if (w < 0){
	System.out.print("Invalid input");
	}

	}
}