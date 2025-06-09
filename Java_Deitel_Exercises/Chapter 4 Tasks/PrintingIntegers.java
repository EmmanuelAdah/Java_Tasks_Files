public class PrintingIntegers {

	public static void main(String[] args){

	int i = 0;

	for ( ; i <= 20; ){
		i++;
		if (i % 5 == 0){
		System.out.println(i); 
		if (i == 20) break;
		continue;
		}
		System.out.print(i + " ");
	}
	}
}