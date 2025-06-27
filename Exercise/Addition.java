public class Addition{

public static void main(String[] args){

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