import java.util.Arrays;
public class Categorize_Numbers {

	public static int[] numberCategories (int[] values, int divisor, int range){

	int divisible = 0;
	
	for (int index = 0; index < range; index++){
		if (values[index] % divisor == 0){
		System.out.print(values[index] + " ");
		divisible += 1;
		}
	}
	if (divisible == 0){
		System.out.print("No divisible number found");	
	}
	return values;
	}
}