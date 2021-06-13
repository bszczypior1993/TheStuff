import java.util.Objects;

public class Person {

    private String name = "Cebula";
    private String surname = "Szczypior";
    private int age = 1;
    private int height = 30;
    private int weight = 10;

public Person (String name, String surname, int age, int height, int weight){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && height == person.height && weight == person.weight && name.equals(person.name) && surname.equals(person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, height, weight);
    }

}
