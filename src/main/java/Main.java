import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class Main
{
    public static void main(String[] args) {
        String s = "Hello world!";
        IntStream stream = s.chars();

        stream.mapToObj(letter -> (char)letter)
                .map(Character::toUpperCase)
                .forEach(System.out::println);

        StringJoiner sj = new StringJoiner(", ", "{", "}");
        sj.add("one").add("two");
        String chain = sj.toString();
        System.out.println(chain);

        //sort
        List<String> strings = Arrays.asList("xavier", "alex", "cedric");

        strings.sort(Comparator.naturalOrder());
        System.out.println(strings);

        // Numbers
        long max = Long.max(1L, 2L);
        BinaryOperator<Long> sum = Long::sum;
    }
}