import lombok.Data;

@Data
public class Person {
    String name;
    Integer age;
    Integer id;

    Person(String name, Integer age, Integer id) {
        this.age = age;
        this.id = id;
        this.name = name;
    }
}
