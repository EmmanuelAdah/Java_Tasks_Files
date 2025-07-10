import java.util.Scanner;
public class BinaryCalculator {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter binary number to convert to base 10: ");
	int binaryInteger = input.nextInt();
	
	int binaryNumber = binaryInteger;
	int binary = 0;

	int counter = 0;
	while (binaryNumber != 0){
		int remainder = binaryNumber % 10;
		binary += remainder * (Math.pow(2, counter));
		binaryNumber /= 10;
	counter++;
	}
	System.out.printf("%d to base ten is %d%n",binaryInteger, binary);
	}
}