import java.util.ArrayList;
import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
        ArrayList<Double[]> rati = new ArrayList<>();

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
    }
}
