import java.util.Scanner;
public class Practice {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int counter = 0;
	

	System.out.print("Enter numbers. type 0 to stop: ");
	int userInput = input.nextInt();

	while (userInput != -1){
	System.out.print("Enter number: ");
	userInput = input.nextInt();
	counter += 1;
	}

}
}
