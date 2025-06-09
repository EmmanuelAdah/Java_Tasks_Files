import java.util.Scanner;
public class TaxCalculator {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the number of citizen(s): ");
	int range = input.nextInt();

	double earnings;
	int counter = 0;
	double tax_rate = 0;
	double pay;
	double actual_rate_30 = (15 / 100);
	double actual_rate_above_30 = (20 / 100);

	while(counter != range){
	System.out.print("Enter earnings in $: ");
	earnings = input.nextDouble();
	pay = earnings;
	counter += 1;
		
		if (pay == 30000){
		tax_rate = (actual_rate_30 * earnings);
		System.out.println(tax_rate);
		}
		else if (pay > 30000){
		tax_rate = (actual_rate_above_30 * earnings);
		System.out.println(tax_rate);
		}
	}
	

	}

}