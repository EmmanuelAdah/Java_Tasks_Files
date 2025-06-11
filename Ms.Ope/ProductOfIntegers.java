import java.util.Scanner;

public class ProductOfIntegers {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first integer: ");
int firstInteger = input.nextInt();

System.out.print("Enter second integer: ");
int secondInteger = input.nextInt();

if (firstInteger > 0 && secondInteger > 0){ 
System.out.printf("Output: %d", (firstInteger * secondInteger));
}else{
System.out.printf("Output: %d", (firstInteger + secondInteger));
}

}
}