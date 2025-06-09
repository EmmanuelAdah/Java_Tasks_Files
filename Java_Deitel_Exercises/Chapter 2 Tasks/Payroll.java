import java.util.Scanner; //importing declaration

//Declaring a class Payroll
public class Payroll {

//Declaring the main method
public static void main(String[] args){

// create a Scanner to obtain input from the command window
Scanner input = new Scanner(System.in);

System.out.print("Enter an integer: "); //prompt user to input integer
int b = input.nextInt(); //Read first input from user

System.out.print("Enter an integer: "); //prompt user to input integer
int c = input.nextInt(); //Read second input from user

int a = b * c; //Multiply variables, then store product in 'a'

//Display the product
System.out.printf("Product: %d%n", a);

}//end main method
}//end class Payroll