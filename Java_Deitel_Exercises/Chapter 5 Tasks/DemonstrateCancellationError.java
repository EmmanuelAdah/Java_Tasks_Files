public class DemonstrateCancellationError {
	public static void main(String[] args){

	double sum = 0;
	for (double i = 1; i <= 2000; i++){
		sum += (1/i);
		System.out.printf("%.0f 	%.9f%n",i ,sum);
	}
	
	}
}