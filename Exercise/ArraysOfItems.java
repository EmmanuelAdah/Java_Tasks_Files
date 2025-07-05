import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.List;

public class ArraysOfItems {
    public static void main(String[] args) {

        String[] numbers = {"tech", "3", "8", "9", "3", "cazaks"};

       String outcome = Arrays.stream(numbers).collect(Collectors.joining(" "));
	System.out.println(outcome);

	List<String> names = Arrays.asList("Emmanuel", "Chidi", "Ada");
	Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));

	System.out.println(names);

	List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> upperCaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(upperCaseWords);
    }
}