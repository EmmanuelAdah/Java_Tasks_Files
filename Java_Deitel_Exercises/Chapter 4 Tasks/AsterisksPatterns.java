public class AsterisksPatterns {

	public static void main(String[] args){
	
	System.out.print("Pattern A");
	int rows = 10;
	for (int i = 1; i <= 10; ++i){
	System.out.println(" ".repeat(rows));
		for (int d = 1; d <= i; d++){
		System.out.print("*");
		}
	} 
	System.out.println("\t");
	System.out.print("Pattern B");
	for (int i = rows; i >= 1; --i){
	System.out.println(" ".repeat(rows));
		for (int d = 1; d <= i; d++){
		System.out.print("*");
		}
	} 
	System.out.println("\t");
	System.out.print("Pattern C");
	System.out.println();
	for (int i = rows; i >= 1; i--){
	for (int space = 1; space <= rows - i; space++){
	System.out.print(" ");
	}
		for (int f = 1; f <= i; f++){
		System.out.print("*");
		}
	System.out.println();
	}
	System.out.print("Pattern D");
	for (int i = 10; i >= 1; i--){
	System.out.println(" ".repeat(rows -i));		
		for (int d = 1; d <= i; d++){
		System.out.print("*");
		}
	
	}
	
	
	}
}