public class PowerOfIntegers {

	public static void main(String[] args) {

	System.out.println("a \t b \t pow(a, b)");

	int number = 1;
	int square = 0;
	
	for (int index = 1; index <= 5; index++){
	number += 1;
	if(number == 2) square = 1 * 1;
	if(number == 3) square = 2 * 2 * 2;
	if(number == 4) square = 3 * 3 * 3 * 3;
	if(number == 5) square = 4 * 4 * 4 * 4 * 4;
	if(number == 6) square = 5 * 5 * 5 * 5 * 5 * 5; 
	System.out.println(index + "\t" + number + "\t" + square);
	}

}
}	