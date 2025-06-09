public class SumOfSeries2{

	public static void main(String[] args){

	System.out.println("Serial No. \t Sum of series");
	long sumOfIntegers = 0;

	for (int index = 1; index <= 100; index++){
	sumOfIntegers += index;
	System.out.printf("%5d  \t %12d%n", index, sumOfIntegers);
	} 

	}
}