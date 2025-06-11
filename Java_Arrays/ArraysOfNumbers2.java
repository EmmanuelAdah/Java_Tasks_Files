public class ArraysOfNumbers2 {

	public static void main(String[] args){

	int[] number = new int[5];

	number[0] = 22;
	number[1] = 51;
	number[2] = 38;
	number[3] = 23;
	number[4] = 48;

	int sumOfi = -0;
	int sumOfd = 0;

	for (int i = 0; i <= 4; i++){
		System.out.print(number[i]); 
		System.out.print(" "); 
		sumOfi += number[i];
		}
		System.out.println("Sum:"+ sumOfi);
 		System.out.println();

		for (int d = 0; d <= 4; d++){
		System.out.println(number[d]);
		sumOfd += number[d];
		}
		System.out.print("Sum:"+ sumOfd);

	}
}