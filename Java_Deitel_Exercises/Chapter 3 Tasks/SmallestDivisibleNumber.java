import java.util.Scanner;

public class SmallestDivisibleNumber {

public static void main(String[] args){

Scannner input = new Scanner(System.in);

System.out.print("Enter first number: ");
int number1 = input.nextInt();

System.out.print("Enter second number: ");
int number2 = input.nextInt();


if (number1 > number2){
System.out.printf("Result: %d", number1);
}
else if (number1 == number2){
System.out.printf("Result: %d", 0);

int remainder = number1 % 6;

}
else {
System.out.printf("Result: %d", number2);
}



}
}