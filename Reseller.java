import java.util.Scanner;
public class Reseller {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	TestDriller quiz = new TestDriller();

	System.out.print("Enter number of copies: ");
	int copies = input.nextInt();

	quiz.priceList(copies);
	}

}