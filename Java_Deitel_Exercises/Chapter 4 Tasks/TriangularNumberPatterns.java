import java.util.Scanner;
public class TriangularNumberPatterns {

	public static void main(String[] args){

	Scanner imma = new Scanner(System.in);
	
	System.out.print("Pattern A");
	int rows = 6;
	for (int i = 1; i <= 6; ++i){
	System.out.println(" ".repeat(rows));
		for (int d = 1; d <= i; d++){
		System.out.print(d+ "");
		System.out.print("");
		}
	} 
	System.out.println("\t");
	System.out.print("Pattern B");
	for (int i = 6; i >= 1; --i){
	System.out.println(" ".repeat(rows));
		for (int d = 1; d <= i; d++){
		System.out.print(d+ "");
		}
	} 
	System.out.println("\t");
	System.out.print("Pattern C");
	for (int i = 1; i <= 6; i++){
	System.out.println("   ".repeat(rows));
		for (int d = 1; d <= i; ++d){
		System.out.print(d+ "");
		}
	}
	System.out.print("  ");
	}
}