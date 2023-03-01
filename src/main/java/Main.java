import java.io.File;
import java.io.FileFilter;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args) {
        Predicate<String> p1 = s -> s.length() < 20;
        Predicate<String> p2 = s -> s.length() > 10;

        Predicate<String> p3 = p1.and(p2);

        List<String> noms = new ArrayList<>(Arrays.asList("Georges", "Bernard", "Henry", "Bartholomé Naomie"));
        // Java8 : Stream.of("Georges", "Bernard", "Henry", "Bartholomé").collect(Collectors.toList());

        List<String> filteredNamesByLength = noms.stream().filter(p3).collect(Collectors.toList());
        Consumer<String> printCons = System.out::println;
        filteredNamesByLength.forEach(printCons);

        System.out.println("-------------------- ");

        String target = "Georges";
        Predicate<String> id = Predicate.isEqual(target);
        List<String> filteredNamesById = noms.stream().filter(id).collect(Collectors.toList());
        filteredNamesById.forEach(printCons);

        System.out.println("-------------------- ");

        List<String> result = new ArrayList<>();
        Consumer<String> addToResult = result::add;

        noms.forEach(printCons.andThen(addToResult));
        System.out.println("size of result = " + result.size());
    }
}