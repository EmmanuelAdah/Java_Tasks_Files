public class ArrayFunctions {

	public static int maximumIn (int user0, int user1, int user2, int user3, int user4, int user5){

	int[] scores = new int[6];
	scores[0] = user0; scores[1] = user1; scores[2] = user2; scores[3] = user3; scores[4] = user4; scores[5] = user5;
	int i = 0;
	int maximum = scores[i];
	for ( ; i < 6; i++){
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
	for ( ; i < 6; i++){
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
	
	int sum = 0;
	for (int i = 0; i < 6; i++){
		if ()
		sum += scores[i];
		}	
	System.out.println("The sum is "+ sum);
	return sum;
	} 

}