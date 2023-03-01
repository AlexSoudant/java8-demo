import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8);
        List<Integer> list3 = Arrays.asList(9, 20, 30);

        List<List<Integer>> list = Arrays.asList(list1, list2, list3);

        System.out.println(list);

        Function<List, Integer> size = List::size;
        Function<List<Integer>, Stream<Integer>> flatmapper = Collection::stream;

        list.stream()
                //map(size)
                .flatMap(flatmapper)
                .forEach(System.out::println);
    }
}