import java.util.Scanner;
public class LineSpacing{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("1 \n\t2 \n\t\t3 \n\t\t\t4");

	System.out.printf("%n%n%n%n 1 \n\t2 \n\t\t3 \n\t\t\t4");

	System.out.println("\n1 \n\t2 \n\t\t3 \n\t\t\t4");
	}
}