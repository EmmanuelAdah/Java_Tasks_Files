import java.util.Arrays;
public class ArrayKata {

	public int maximumIn (int integers[]){
	int i = 0;
	int maximum = integers[0];
	for ( ; i < integers.length; i++){
		if (integers[i] > maximum) maximum = integers[i];
		}
	System.out.println("The maximum is " + maximum);
	return maximum;
	}

	public static int minimumIn (int integers[]){
	int i = 0;
	int minimum = integers[i];
	for (  ; i < integers.length; i++){
		if (integers[i] < minimum) minimum = integers[i];
		}
	System.out.println("The minimum is " + minimum);
	return minimum;
	}

	public static int sumOf (int integers[]){

	int sum = 0;
	for (int i = 0; i < integers.length; i++){
		sum += integers[i];
		}
	System.out.println("The sum is " + sum);
	return sum;
	}
	
	public static int sumOfEvenNumbersIn (int integers[]){

	int sumOfEvens = 0;
	for (int i = 0; i < integers.length; i++){
		if (integers[i] % 2== 0) sumOfEvens += integers[i];
		}
	System.out.println("The sum of even numbers is " + sumOfEvens);
	return sumOfEvens;
	}

	public static int sumOfOddNumbersIn (int integers[]){

	int sumOfOdds = 0;
	for (int i = 0; i <= integers.length - 1; i++){
		if (integers[i] % 2 != 0) sumOfOdds += integers[i];
		}
	System.out.println("The sum of odd numbers is " + sumOfOdds);
	return sumOfOdds;
	}

	public static int[] maximumAndMinimumIn (int integers[]){

	int i = 0;
	int[] minMax = new int[2];
	int maximum = integers[i];
	int minimum = integers[i];
	for ( ; i <= integers.length - 1; i++){
		if (integers[i] > maximum){
		maximum = integers[i];
		minMax[1] = integers[i];
		}
		if (integers[i] < minimum){
		minimum = integers[i];
		minMax[0] = integers[i];
		}
	}
	System.out.printf("The maximum is %d and minimum is %d%n",maximum, minimum);
	return minMax;
	}

	public static int noOfOddNumbersIn (int integers[]){

	int oddNumbers = 0;
	for (int i = 0; i <= integers.length - 1; i++){
		if (integers[i] % 2 != 0) oddNumbers += 1;
		}
	System.out.println("The number of odd numbers is " + oddNumbers);
	return oddNumbers;
	}

	public static int noOfEvenNumbersIn (int integers[]){

	int evenNumbers = 0;
	for (int i = 0; i < integers.length; i++){
		if (integers[i] % 2 == 0) evenNumbers += 1;
		}
	System.out.println("The number of even numbers is " + evenNumbers);
	return evenNumbers;
	}

	public static int[] evenNumbersIn (int integers[]){
	
	System.out.print("The even numbers are: ");
	int[] evenIntegers = new int[integers.length];
	for (int i = 0; i <= integers.length - 1; i++){
		if (integers[i] % 2 == 0){
		evenIntegers[i] = integers[i];
		System.out.print(integers[i] + " ");
		}
		}
	System.out.print("\n");
	return evenIntegers;
	}

	public static int[] oddNumbersIn (int integers[]){

	System.out.print("Odd numbers are: ");
	int[] oddIntegers = new int[integers.length];
	for (int i = 0; i < integers.length; i++){
		if (integers[i] % 2 != 0){
		oddIntegers[i] = integers[i];
		System.out.print(integers[i] + " ");
		}
		}
	System.out.print("\n");
	return oddIntegers;
	}

	public static int[] squareNumbersIn (int integers[]){

	int i = 0;
	int[] square = new int [integers.length];
	for ( ; i < integers.length; i++){
		square[i] += (Math.pow(integers[i],2));
		System.out.printf("The square of %d is %d%n", integers[i], square[i]);
		}
	return square;
	}

}