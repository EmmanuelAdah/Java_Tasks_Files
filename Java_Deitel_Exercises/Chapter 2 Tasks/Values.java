import java.util.Scanner;

public class PositiveNegativeValues {
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter your number: ");
int firstnumber = input.nextInt();

System.out.print("Enter your number: ");
int secondnumber = input.nextInt();

System.out.print("Enter your number: ");
int thirdnumber = input.nextInt();

System.out.print("Enter your number: ");
int fourthnumber = input.nextInt();

System.out.print("Enter your number: ");
int fifthnumber = input.nextInt();

if (firstnumber < 0){
System.out.print("First number is a negative integer");
}
if (firstnumber == 0){
System.out.print("First number is Zero");
}
if (firstnumber > 0){
System.out.print("First number is a positive integer");
}

if (secondnumber < 0){
System.out.print("Second number is a negative integer");
}

if (secondnumber == 0){
System.out.print("Second number integer is Zero");
}

if (secondnumber > 0){
System.out.print("Second number is a positive integer");
}

if (thirdnumber < 0){
System.out.print("Third number is a negative integer");
}

if (thirdnumber == 0){
System.out.print("Third number is Zero");
}

if (thirdnumber > 0){
System.out.print("Third number is a positive integer");
}

if (fourthnumber < 0){
System.out.print("Fourth number is a negative integer");
}

if (fourthnumber == 0){
System.out.print("Fourth number is Zero");
}

if (fourthnumber > 0){
System.out.print("Fourth number is a positive integer");
}

if (fifthnumber < 0){
System.out.print("Fifth number is a negative integer");
}

if (fifthnumber == 0){
System.out.print("Fifth number is Zero");
}

if (fifthnumber > 0){
System.out.print("Fifth number is a possible integer");
}
}
}