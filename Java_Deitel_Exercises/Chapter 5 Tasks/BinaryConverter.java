import java.util.Scanner;
public class BinaryConverter {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter number to convert to binary: ");
	int number = input.nextInt();
	
	int binaryNumber = number;
	String binary = "";
        while (binaryNumber != 0){
		int remainder = binaryNumber % 2;
		binary += remainder;
		binaryNumber /= 2;
	}

        String baseTwo = "";
	for (int index = binary.length() - 1; index >= 0; index-- ) {  baseTwo += binary.charAt(index);  }
	System.out.printf("%d to base two is %s%n",number, baseTwo);
	}
}