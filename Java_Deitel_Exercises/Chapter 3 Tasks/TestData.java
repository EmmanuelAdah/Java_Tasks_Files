import java.util.Scanner;

public class TestData {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first integer: ");
int firstInteger = input.nextInt();

System.out.print("Enter second integer: ");
int secondInteger = input.nextInt();

double product = (firstInteger * secondInteger);

System.out.printf("Expected Output: %d * %d = %.0f ", firstInteger, secondInteger, product);
}
}