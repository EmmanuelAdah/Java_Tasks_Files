import java.util.Scanner;

public class IntegerDifference {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("First integer: ");
	int firstInteger = input.nextInt();

	System.out.print("Second integer: ");
	int secondInteger = input.nextInt();

	System.out.print("Third integer: ");
	int thirdInteger = input.nextInt();

	System.out.print("Fourth integer: ");
	int fourthInteger = input.nextInt();

	System.out.print("Fifth integer: ");
	int fifthInteger = input.nextInt();

	if(firstInteger > secondInteger && firstInteger > thirdInteger && firstInteger > fourthInteger && firstInteger > fifthInteger){
	System.out.print("Largest: First Integer");
	}
	if(secondInteger > firstInteger && secondInteger > thirdInteger && secondInteger > fourthInteger && secondInteger > fifthInteger){
	System.out.print("Largest: Second Integer");
	}
	if(thirdInteger > firstInteger && thirdInteger > secondInteger && thirdInteger > fourthInteger && thirdInteger > fifthInteger){
	System.out.print("Largest: Third Integer");
	}
	if(fourthInteger > firstInteger && fourthInteger > thirdInteger && fourthInteger > secondInteger && fourthInteger > fifthInteger){
	System.out.print("Largest: Fourth Integer");
	}
	if(fifthInteger > firstInteger && fifthInteger > secondInteger && fifthInteger > fourthInteger && fifthInteger > thirdInteger){
	System.out.print("Largest: Fifth Integer");
	}

	if(firstInteger < secondInteger && firstInteger < thirdInteger && firstInteger < fourthInteger && firstInteger < fifthInteger){
	System.out.println("\nSmallest: First Integer");
	}
	if(secondInteger < firstInteger && secondInteger < thirdInteger && secondInteger <  fourthInteger && secondInteger < fifthInteger){
	System.out.println("\nSmallest: Second Integer");
	}
	if(thirdInteger < firstInteger && thirdInteger < secondInteger && thirdInteger < fourthInteger && thirdInteger < fifthInteger){
	System.out.println("\nSmallest: Third Integer");
	}
	if(fourthInteger < firstInteger && fourthInteger < thirdInteger && fourthInteger <  secondInteger && fourthInteger < fifthInteger){
	System.out.println("\nSmallest: Fourth Integer");
	}
	if(fifthInteger < firstInteger && fifthInteger < secondInteger && fifthInteger < fourthInteger && fifthInteger < thirdInteger){
	System.out.println("\nSmallest: Fifth Integer");
	}

	} 
}