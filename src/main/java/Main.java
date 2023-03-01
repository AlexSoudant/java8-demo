import java.io.FileFilter;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8);
        List<Integer> list3 = Arrays.asList(9, 20, 30);

        List<List<Integer>> list = Arrays.asList(list1, list2, list3);

        System.out.println(list);

        Function<List<Integer>, Stream<Integer>> flatmapper = Collection::stream;

        String sentence = list.stream()
                .flatMap(flatmapper)
                .filter(number -> number > 3)
                .map(Object::toString)//number -> number.toString()
                .collect(Collectors.joining(", ")); //toList()

        System.out.println(sentence);

        Person user1 = new Person("Boris",20, 0);
        Person user2 = new Person("Loic",216, 1);
        Person user3 = new Person("Samantha",16, 2);

        List<Person> users =  Arrays.asList(user1, user2, user3);

        Map<Integer, Long> filteredUsers = users.stream()
                .filter(user -> user.age < 100)
                .collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));

        System.out.println(filteredUsers);
    }
}