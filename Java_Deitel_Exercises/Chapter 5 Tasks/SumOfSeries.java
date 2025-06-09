public class SumOfSeries {
	public static void main(String[] args){

	double count = 3;
	double sum = 0;
	for (double i = 1; i <= 97; i += 2){
		sum += (i/count);
		count += 2;
		System.out.printf("%8.3f%n",sum);
	}
	
	}
}