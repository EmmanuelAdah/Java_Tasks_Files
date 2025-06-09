import java.util.Scanner;
public class ArithmeticCalculator {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	String options = """
		Press;-
		1 > Addition
		2 > Subtraction
		3 > Multiplication
		4 > Division
		0 > Quit
		""";

		int total = 0;

	boolean option = true;

	while (option == true){

	System.out.println(options);
	System.out.print("Make selection to start: ");
	int userOption = input.nextInt();

	switch (userOption){

		case 1: {

			System.out.print("Enter integer. Type -1 to stop: ");
			int userNumber1 = input.nextInt();

			while (userNumber1 != -1){
				total += userNumber1;
				System.out.print("Enter integer: ");
				userNumber1 = input.nextInt();
				}
				System.out.printf("Total: %d%n", total);
				System.out.printf("Would you like to perform another arithmetics. %nIf yes (1), No (2): ");
				int back = input.nextInt();
				
				if (back == 1) option = true;
				else if (back == 2) System.out.println("Goodbye");

			} break;
		case 2: {

			System.out.println("Enter integer. Type 1 to stop: ");
			int userNumber2 = input.nextInt();

			while (userNumber2 != 1){
				total -= userNumber2;
				System.out.print("Enter integer: ");
				userNumber2 = input.nextInt();
				}
				System.out.printf("Total: %d%n", total);
				System.out.printf("Would you like to perform another arithmetics.%n If yes (1), No (2): ");
				int back2 = input.nextInt();
				
				if (back2 == 1) option = true;
				else if (back2 == 2) System.out.println("Goodbye");

			} break;
		case 3: {

			System.out.println("Enter integer. Type 0 to stop: ");
			int userNumber3 = input.nextInt();
			
			while (userNumber3 != 0){
				total *= userNumber3;
				System.out.print("Enter integer: ");
				userNumber3 = input.nextInt();
				}
				System.out.printf("Total: %d%n", (double)total);
				System.out.printf("Would you like to perform another arithmetics.%n If yes (1), No (2): ");
				int back3 = input.nextInt();
				
				if (back3 == 1) option = true;
				else if (back3 == 2) System.out.println("Goodbye");

			} break;

		case 4: {

			System.out.println("Enter integer. Type 0 to stop: ");
			int userNumber4 = input.nextInt();
			total += userNumber4;

			while (userNumber4 != 0){
				System.out.print("Enter integer: ");
				userNumber4 = input.nextInt();
				total /= userNumber4;
				}
				System.out.printf("Total: %d%n", total);
				System.out.printf("Would you like to perform another arithmetics.%n If yes (1), No (2): ");
				int back4 = input.nextInt();
				
				if (back4 == 1) option = true;
				else if (back4 == 2) System.out.println("Goodbye");

			} break;
		case 0: System.out.println("Goodbye"); break;
		} break;

	}

	}
}