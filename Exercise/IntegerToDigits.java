public class IntegerToDigits {

	public static void recursion (int num) {

	if (num > 0){
	recursion(num / 10);
	System.out.printf("%d ",num % 10);
	}
	}
}