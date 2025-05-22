import java.util.Arrays;
public class ArrayKata {

	public int[] maximumIn (int integers[]){
	int i = 0;
	int maximum = integers[0];
	for ( ; i < integers.length; i++){
		if (integers[i] > maximum) maximum = integers[i];
		}
	System.out.println("The maximum is " + maximum);
	return integers;
	}

	public static int[] minimumIn (int integers[]){
	int i = 0;
	int minimum = integers[i];
	for (  ; i < integers.length; i++){
		if (integers[i] < minimum) minimum = integers[i];
		}
	System.out.println("The minimum is " + minimum);
	return integers;
	}

	public static int[] sumOf (int integers[]){

	int sum = 0;
	for (int i = 0; i < integers.length; i++){
		sum += integers[i];
		}
	System.out.println("The sum is " + sum);
	return integers;
	}
	
	public static int[] sumOfEvenNumbersIn (int integers[]){

	int even = 0;
	for (int i = 0; i < integers.length; i++){
		if (integers[i] % 2== 0) even += integers[i];
		}
	System.out.println("The sum of even numbers is " + even);
	return integers;
	}

	public static int[] sumOfOddNumbersIn (int integers[]){

	int odd = 0;
	for (int i = 0; i <= integers.length - 1; i++){
		if (integers[i] % 2 != 0) odd += integers[i];
		}
	System.out.println("The sum of odd numbers is " + odd);
	return integers;
	}

	public static int[] maximumAndMinimumIn (int integers[]){

	int i = 0;
	int maximum = integers[i];
	int minimum = integers[i];
	for ( ; i <= integers.length - 1; i++){
		if (integers[i] > maximum){
		maximum = integers[i];
		} 
		if (integers[i] < minimum){
		minimum = integers[i];
		} 

	}
	System.out.printf("The maximum is %d and minimum is %d%n",maximum, minimum);
	return integers;
	}

	public static int[] noOfOddNumbersIn (int integers[]){

	int odd = 0;
	for (int i = 0; i <= integers.length - 1; i++){
		if (integers[i] % 2 != 0) odd += 1;
		}
	System.out.println("The number of odd numbers is " + odd);
	return integers;
	}

	public static int[] noOfEvenNumbersIn (int integers[]){

	int even = 0;
	for (int i = 0; i < integers.length; i++){
		if (integers[i] % 2 == 0) even += 1;
		}
	System.out.println("The number of even numbers is " + even);
	return integers;
	}

	public static int[] evenNumbersIn (int integers[]){
	
	System.out.print("The even numbers are: ");
	for (int i = 0; i <= integers.length - 1; i++){
		if (integers[i] % 2 == 0){
		System.out.print(integers[i] + " ");
		}
		}
	System.out.print("\n");
	return integers;
	}

	public static int[] oddNumbersIn (int integers[]){

	System.out.print("Odd numbers are: ");
	for (int i = 0; i < integers.length; i++){
		if (integers[i] % 2 != 0){
		System.out.print(integers[i] + " ");
		}
		}
	System.out.print("\n");
	return integers;
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