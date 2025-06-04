import java.util.Arrays;
public class Categorize_Numbers {

	public static int[] numberCategories (int[] values, int divisor, int range){

	int divisible = 0;
	
	for (int i = 0; i < range; i++){
		if (values[i] % divisor == 0){
		System.out.println(values[i]);
		divisible += 1;
		}
	}
	if (divisible == 0){
		System.out.print("No divisible number found");	
	}
	return values;
	}
}