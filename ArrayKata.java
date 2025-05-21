public class ArrayKata {

	public int[] maximumIn (int integers[]){
	int i = 0;
	int maximum = integers[i];
	for ( ; i < integers.length; i++){
		if (integers[i] > maximunm) maximum = integers[i];
		}
	return maximum;
	}

	public static int[] minimumIn (int integers[]){
	int i = 0;
	int minimum = integers[i];
	for (  ; i < integers.length; i++){
		if (integers[i] > minimum) minimum = integers[i];
		}
	return minimum;
	}

	public static int[] sumOf (int integers[]){

	int sum = 0;
	for (int i = 0; i < integers.length; i++){
		sum += integers[i];
		}
	return sum;
	}
	
	public static int[] sumOfEvenNumbersIn (int integers[]){

	int even = 0;
	for (int i = 0; i < integers.length; i++){
		if (integers[i] % 2== 0) even += integers[i];
		}
	return even;
	}

	public static int[] sumOfOddNumbersIn (int integers[]){

	int odd = 0;
	for (int i = 0; i <= integers.length - 1; i++){
		if (integers[i] % 2 != 0) odd += integers[i];
		}
	return odd;
	}

	public static int[] maximumAndMinimumIn (int integers[]){

	int[] maximum = integers[0];
	int[] minimum = integers[0];
	for (int i = 0; i <= integers.length - 1; i++){
		if (integers[i] > maximunm){
		maximum = integers[i];
		} return maximum;
		if (integer[0] < minimum){
		minimum = integers[i];
		} 
		return minimum;
	}
	}

	public static int[] noOfOddNumbersIn (int integers[]){

	int odd = 0;
	for (int i = 0; i <= integers.length - 1; i++){
		if (integers[i] % 2 != 0) odd += 1;
		}
	return odd;
	}

	public static int[] noOfEvenNumbersIn (int integers[]){

	int even = 0;
	for (int i = 0; i < integers.length; i++){
		if (integers[i] % 2 == 0) even += 1;
		}
	return even;
	}

	public static int[] evenNumbersIn (int integers[]){

	int[] evenNumber = integers[0];
	for (int i = 0; i <= integers.length - 1; i++){
		if (integers[i] % 2 == 0){
		System.out.print(integers[i]);
		}
		}
	return evenNumber;
	}

	public static int[] oddNumbersIn (int integers[]){

	int oddNumber = 0;
	int[] integer = new int[integers.length];
	for (int i = 0; i < integers.length; i++){
		if (integers[i] % 2 != 0){
		System.out.print("Odd numbers in are: " + integers[i] + " ");
		}
		oddNumber = integers[i];
		}
	return oddNumber;
	}

	public static int[] squareNumbersIn (int integers[]){

	int[] square = integers[0];
	for (int i = 0; i < integers.length; i++){
		square = (Math.pow(integers[i],2));
		System.out.printf("The square of %d is %d%n", integers[i], square);
		square = integers[i];
		}
	return square;
	}


	}

}