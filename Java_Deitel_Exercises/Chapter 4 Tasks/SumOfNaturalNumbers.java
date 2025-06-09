import java.util.Scanner;
public class SumOfNaturalNumbers {

	public static void main(String[] args){

	Scanner imma = new Scanner(System.in);
	
	int number = 10;
	int sum = 0;

	for (int i = 1; i <= 10; ++i)
	sum += i;
	System.out.printf("Sum of the first %d Natural number is %d%n", number, sum);

	}
}