import java.util.Scanner;

//Declaring the class circle
public class Circle {

	//Declaring the main method
	public static void main(String[] args){

	//Declaring the scanner variable input
	Scanner input = new Scanner(System.in);

	System.out.print("Enter your radius: "); //Prompt user input
	double radius = input.nextDouble(); //Declaring the variable radius with type double

	double circumference = 2 * 3.14159 * radius; //Declaring a double variable, circumference
	double area = 3.14159 * radius * radius; //Declaring a double variable, area
	double diameter = 2 * radius; //Declaring a double variable, diameter

	System.out.printf("Diameter: %f%n", diameter); //Print result for diameter

	System.out.printf("Circumference: %f%n", circumference); //Print result for circumference

	System.out.printf("Area: %f%n", area); //Print result for area
	} //end method main
} //end class circle