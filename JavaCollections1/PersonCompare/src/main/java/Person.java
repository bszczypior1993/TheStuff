public abstract class Person {

    static String name;
    static String surname;
    static int birthYear;
    static int height;
    static int weight;

    Person(String name, String surname, int birthYear, int height, int weight) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;

        }
    abstract String getName();
}