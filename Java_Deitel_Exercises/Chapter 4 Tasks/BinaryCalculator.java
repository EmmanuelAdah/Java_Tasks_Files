import java.util.Scanner;
public class BinaryCalculator {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a five digit binary number: ");
	int binaryNumber = input.nextInt();
	
	int binary = 0;

	for(int i = 0; i <= 4; i++){
		int remainder = binaryNumber % 10;
		binary += remainder * (Math.pow(2,i));
		binaryNumber /= 10;
	}
	System.out.printf("%d to base ten is %d%n",binaryNumber, binary);
	}

}