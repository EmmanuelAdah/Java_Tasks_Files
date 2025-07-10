import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDateTime;

public class Practice {

    public static void main(String[] args) {
/*       
 ArrayList<Double[]> rati = new ArrayList<>();
	ArrayList<ArrayList<Double>> ratings = new ArrayList<>();

	for (int i = 0; i < 4; i++){
		ratings.add(new ArrayList<>());
	}

	ratings.get(0).add(4.0);
	ratings.get(0).add(5.0);
	
	System.out.println(ratings);
	System.out.println(ratings.get(0));
	System.out.println(ratings.get(0).size());
	ratings.remove(0);
	System.out.println(ratings);
        for (int index = 0; index < 5; index++) {
            rati.add(new Double[]{(2.0 + index), (4.5  + index)});
        }

        System.out.println(Arrays.deepToString(rati.toArray()));

        for (Double[] item : rati) {
            for (double d : item) {
                System.out.print(d + " ");
            }
            Double[] man = rati.getFirst();
            System.out.println(man[man.length - 2]);
        }
*/
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy MM dd / hh:mm AA");
        System.out.println(sdf.format(date));
    }
}