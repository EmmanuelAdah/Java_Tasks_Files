import java.util.Scanner;
import java.util.Arrays;
public class Number_Categorise {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	Categorize_Numbers array = new Categorize_Numbers();

	System.out.print("Enter range: ");
	int range = input.nextInt();

	System.out.print("Enter divisor: ");
	int divisor = input.nextInt();

	int counter = 0;
	double value;
	int[] values = new int[range];

	while (counter != range){
		System.out.printf("Enter number %d: ",counter + 1);
		value = input.nextDouble();
		values[counter] += value;
		counter += 1;	
	}
	array.numberCategories(values,divisor,range);
	}

}