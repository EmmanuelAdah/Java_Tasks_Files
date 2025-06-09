import java.util.Scanner;

public class PositiveNegativeValues {
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter your number: ");
int i = input.nextInt();

if (i < 0){
System.out.print("It is a negative integer");
}
if (i == 0){
System.out.print("The integer is Zero");
}
if (i > 0){
System.out.print("It is a positive integer");
}

}
}