import java.util.Arrays;
public class LargestElements {

	public static int[] isElements (double[][] arrays){

	double maximum = arrays[0][0];
	int[] table = new int[2];

	for (int index = 0; index < arrays.length; index++){
		for (int count = 0; count < arrays[index].length; count++){
		if (arrays[index][count] > maximum){
			maximum = arrays[index][count];
			table[0] = index;
			table[1] = count;
			}
		}
	}
	//System.out.print(Arrays.toString(table));
	return table;
	}

}