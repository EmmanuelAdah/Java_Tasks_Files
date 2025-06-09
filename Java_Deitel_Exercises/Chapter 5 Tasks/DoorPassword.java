import java.util.Scanner;
public class DoorPassword {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Type your name to access the door: ");
	int userName = input.nextInt();

	if (userName == 10){
	System.out.println("Welcome, Junior. \nThe door is open");
	}
	else if (userName == 11){
	System.out.println("Welcome, Adah. \nThe door is open");
	}

	else if (userName == 12){
	System.out.println("Welcome, Caleb. \nThe door is open");
	} 
	else {
		System.out.println("Invalid password. \nAccess Denied");
		}
	}
}