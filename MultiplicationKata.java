public class MultiplicationKata {

	public static int multiplication (int startPoint, int endPoint){

	int multiple = 0;

	for (int i = startPoint; i <= endPoint; i++){
	
	System.out.print(" ".repeat(i));
	System.out.print("\n" + i + " |");
	for (int j = 1; j <= endPoint; j++){
	multiple = (i * j);
	System.out.print("\t" + multiple);
	}
	System.out.print("\t");
	}
	return multiple;
	}
}