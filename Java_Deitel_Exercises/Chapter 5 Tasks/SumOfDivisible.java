public class SumOfDivisible {

	public static void main(String[] args){

	int sum = 0;
	for (int index = 0; index <= 30; index++){
		if (index % 3 ==  0){
			sum += index;
			}
		}
		System.out.print("The sum of numbers from 1-30 that is divisible by 3 is " + sum);
	}
}