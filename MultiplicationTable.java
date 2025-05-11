import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your start point: ");
	int startPoint = input.nextInt();

	System.out.print("Enter your end point: ");
	int endPoint = input.nextInt();

	for (int i = startPoint; i <= endPoint; i++){
	for (int j = 1; j <= endPoint; j++){
	System.out.println(i * j);
	}
	System.out.println(" ");
	}

	}

} 