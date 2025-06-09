import java.util.Scanner;

public class LitreConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	System.out.print("Enter your budget: ");
	double budget = input.nextInt();

	double pricePerLitre = 855;

	double litres = budget / pricePerLitre;

	System.out.printf("The litre(s) for your budget is %.2f%n", litres);
	}
}