import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter integers a five digit number: ");
	int integers = input.nextInt();

	int integer1 = integers / 10000;
	int integer2 = integers / 1000 % 10;
	int integer3 = integers / 100 % 10;
	int integer4 = integers / 10 % 10;
	int integer5 = integers % 10;

	int reverse = integer1 * 1 + integer2 * 10 + integer3 * 100 + integer4 * 1000 + integer5 * 10000;

	if (integers == reverse){
		System.out.print(integers + " is a palindrome");
	}
	else{
		System.out.print(integers + " is not a palindrome");
	}
	
	}
}