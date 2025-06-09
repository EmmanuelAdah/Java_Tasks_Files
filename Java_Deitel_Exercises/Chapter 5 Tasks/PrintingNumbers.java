public class PrintingNumbers {

	public static void main(String[] args){

	int i = 0;

	while (i != 20){
		i++;
		if (i % 5 == 0){
		System.out.println(i); continue;
		}
		System.out.print(i + " ");
	}
	}
}