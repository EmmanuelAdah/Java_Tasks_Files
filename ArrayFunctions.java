public class ArrayKata {

	public static int maximumIn (int user0, int user1, int user2, int user3, int user4, int user5){

	int[] scores = new int[6];
	scores[0] = user0; scores[1] = user1; scores[2] = user2; scores[3] = user3; scores[4] = user4; scores[5] = user5;
	int i = 0;
	int maximum = scores[i];
	for ( ; i < scores.length; i++){
		if (scores[i] > maximum){
		maximum = scores[i];
		}	
	} 
	System.out.println("The maximum is "+ maximum);
	return maximum;
	} 
	
	public static int minimumIn (int user0, int user1, int user2, int user3, int user4, int user5){
	int[] scores = new int[6];
	scores[0] = user0; scores[1] = user1; scores[2] = user2; scores[3] = user3; scores[4] = user4; scores[5] = user5;
	
	int i = 0;
	int minimum = scores[i];
	for ( ; i < scores.length; i++){
		if (scores[i] < minimum){
		minimum = scores[i];
		}	
	} 
	System.out.println("The minimum is "+ minimum);
	return minimum;
	} 

	public static int SumOfIntegers (int user0, int user1, int user2, int user3, int user4, int user5){
	int[] scores = new int[6];
	scores[0] = user0; scores[1] = user1; scores[2] = user2; scores[3] = user3; scores[4] = user4; scores[5] = user5;
	
	int sum = scores[0];
	for (int i = 1; i < 6; i++){
		sum += scores[i];
		}	
	System.out.println("The sum is "+ sum);
	return sum;
	} 

	public static int SumOfEvenNumbers (int user0, int user1, int user2, int user3, int user4, int user5){
	int[] scores = new int[6];
	scores[0] = user0; scores[1] = user1; scores[2] = user2; scores[3] = user3; scores[4] = user4; scores[5] = user5;
	
	int sumOfEven = 0;
	for (int i = 0; i < 6; i++){
		if (scores[i] % 2 == 0){
		sumOfEven += scores[i];
		}
	}	
	System.out.println("The sum of even numbers is "+ sumOfEven);
	return sumOfEven;
	} 

	public static int SumOfOddNumbers (int user0, int user1, int user2, int user3, int user4, int user5){
	int[] scores = new int[6];
	scores[0] = user0; scores[1] = user1; scores[2] = user2; scores[3] = user3; scores[4] = user4; scores[5] = user5;
	
	int sumOfOdd = 0;
	for (int i = 0; i < scores.length; i++){
		if (scores[i] % 2 != 0){
		sumOfOdd += scores[i];
		}
	}	
	System.out.println("The sum of odd numbers is "+ sumOfOdd);
	return sumOfOdd;
	} 
	
	public static int maximumAndMinimumOf (int user0, int user1, int user2, int user3, int user4, int user5){

	int[] scores = new int[6];
	scores[0] = user0; scores[1] = user1; scores[2] = user2; scores[3] = user3; scores[4] = user4; scores[5] = user5;
	int i = 0;
	int maximum = scores[i];
	int minimum = scores[i];

	for ( ; i < scores.length; i++){
		if (scores[i] > maximum){
		maximum = scores[i];
		}
		if (scores[i] < minimum){
		minimum = scores[i];
		}	
	} 
	System.out.println("The maximum is "+ maximum + " and the minimum is " + minimum);
	return maximum + minimum;
	} 
	
	public static int noOfOddNumbersIn (int user0, int user1, int user2, int user3, int user4, int user5){

	int[] scores = new int[6];
	scores[0] = user0; scores[1] = user1; scores[2] = user2; scores[3] = user3; scores[4] = user4; scores[5] = user5;
	int i = 0;
	int oddNumbers = 0;

	for ( ; i < 6; i++){
		if (scores[i] % 2 != 0){
		oddNumbers += 1;
		}	
	} 
	System.out.println("No of odd number(s) is "+ oddNumbers);
	return oddNumbers;
	} 

	public static int noOfEvenNumbersIn (int user0, int user1, int user2, int user3, int user4, int user5){

	int[] scores = new int[6];
	scores[0] = user0; scores[1] = user1; scores[2] = user2; scores[3] = user3; scores[4] = user4; scores[5] = user5;
	int i = 0;
	int evenNumbers = 0;

	for ( ; i < 6; i++){
		if (scores[i] % 2 == 0){
		evenNumbers += 1;
		}	
	} 
	System.out.println("No of even number(s) is "+ evenNumbers);
	return evenNumbers;
	} 

	public static int evenNumbersIn (int user0, int user1, int user2, int user3, int user4, int user5){

	int[] scores = new int[6];
	scores[0] = user0; scores[1] = user1; scores[2] = user2; scores[3] = user3; scores[4] = user4; scores[5] = user5;
	int i = 0;
	System.out.print("The even number(s) are ");
	for ( ; i < 6; i++){
		if (scores[i] % 2 == 0){
		System.out.print(scores[i] + " ");
		}	
	} 
	System.out.println(" ");
	return i;
	} 

	public static int oddNumbersIn (int user0, int user1, int user2, int user3, int user4, int user5){

	int[] scores = new int[6];
	scores[0] = user0; scores[1] = user1; scores[2] = user2; scores[3] = user3; scores[4] = user4; scores[5] = user5;
	int i = 0;
	System.out.print("The odd number(s) are ");
	for ( ; i < 6; i++){
		if (scores[i] % 2 != 0){
		System.out.print(scores[i] + " ");
		}	
	} 
	System.out.println(" ");
	return i;
	} 

	public static int squareNumbersIn (int user0, int user1, int user2, int user3, int user4, int user5){

	int[] scores = new int[6];
	scores[0] = user0; scores[1] = user1; scores[2] = user2; scores[3] = user3; scores[4] = user4; scores[5] = user5;
	int i = 0;
	int square = 0;
	System.out.print("The square number(s) are ");
	for ( ; i < scores.length; i++){
		square = scores[i] * scores[i];
		System.out.print(square + " ");
		}	
	System.out.println("");
	return square;
	} 


}