import java.util.Scanner;

public class Multiplication {
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("number\tsquare\tcube");

	for (int i = 0; i <= 10; i++){
	System.out.println( i + "\t" + i * i + "\t" + i * i * i);
	}

	}
}