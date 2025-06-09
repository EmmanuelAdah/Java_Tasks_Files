import java.util.Scanner;
public class DollarToYuan {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter dollar to yuan exchange rate: ");
	double rate = input.nextDouble();

	if (rate <= 0){
	System.out.print("Input must be greater than 0");
	}
	else {
	System.out.print("Enter 0 to convert dollar to RMB and 1 vice versa: ");
	double converter = input.nextDouble();	
		if (converter == 0){
		System.out.print("Enter amount in dollar: ");
		double dollarAmount = input.nextDouble();
			if (dollarAmount > 0){
			double yuan = dollarAmount * rate;
			double dollar = yuan / rate;
			System.out.printf("$%.1f is %.1f yuan", dollar, yuan);
			}
			else {
			System.out.print("Invalid input");
			}
		}
		else if (converter == 1){
		System.out.print("Enter amount in dollar: ");
		double dollarAmount = input.nextDouble();
			if (dollarAmount > 0){
			double yuan = dollarAmount * rate;
			double dollar = yuan / rate;
			System.out.printf("%.1f yuan is $%.1f ",yuan, dollar);
			}
			else {
			System.out.print("Invalid input");
			}
		}
	}

}
}