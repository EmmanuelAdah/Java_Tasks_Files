public class Addition{

public static void main(String[] args){

	System.out.println(100 + 100+ "Simple linear");
	System.out.println( "E-Learning" + 100 + 100);

	int sum = 0;
	for(int i = 0; i <= 30; i++) {
		if (i % 3 == 0) {
			sum += i;
		}
	}
	System.out.println("Sum: "+ sum);

	int a = 2;
	int b = 3;

	int c = a * b;

	System.out.print(c);

}
}