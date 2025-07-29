public class BarChartStudentGrade {

	public static void main(String[] args){

	int[] array = {1,3,2,9,3,8,6,1,13,5,2};

	System.out.println("Grade distribution chart;-");
	for(int counter = 0; counter < array.length; counter++){
	if (counter == array.length-1){
	System.out.printf("%10d ", (array.length-1) * 10 );
	}
	else {
	System.out.printf("%3d - %3d  ",(counter * 10), (counter * 10 + 9) );
	}
		for (int star = 0; star < array[counter]; star++){
		System.out.print("*");
		}
	System.out.println("");
	}

	}
}