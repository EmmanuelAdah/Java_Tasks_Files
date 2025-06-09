public class MultiplicationKata {

	public static int multiplication (int startPoint, int endPoint){

	int multiple = 0;
	for (int k = startPoint; k <= endPoint; k++){
	System.out.print("\t" + k);
	}
	System.out.println("");
	for (int l = startPoint; l <= endPoint; l++){
	System.out.printf("%s", "--------");
	}
	System.out.print("---");

	for (int i = startPoint; i <= endPoint; i++){
	System.out.print(" ".repeat(i));
	System.out.printf("\n%2d %s", i, "|");
	for (int j = 1; j <= endPoint; j++){
	multiple = (i * j);
	System.out.print("\t" + multiple);
	}
	System.out.print("\t");
	}
	return multiple;
	}
}