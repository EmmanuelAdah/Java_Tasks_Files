public class PowerOfIntegersPow {

	public static void main(String[] args) {

	System.out.println("a \tb \tpow(a, b)");

	int number = 1;
	
	for (int index = 1; index <= 5; index++){
	number += 1;

	System.out.println(index + "\t" + number + "\t" + (int)(Math.pow(index, number)) );
	}

}
}	