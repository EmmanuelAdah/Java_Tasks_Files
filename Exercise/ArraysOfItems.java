import java.util.Arrays;

public class ArraysOfItems {
    public static void main(String[] args) {

        int[] numbers = {5, 3, 8, 9, 3, 4, 6};

        Arrays.stream(numbers).forEach(System.out::println);
    }
}
