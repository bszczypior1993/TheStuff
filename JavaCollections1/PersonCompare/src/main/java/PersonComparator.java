import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class PersonComparator implements Comparator<Person> {

    enum ComparisonType {
        HEIGHT,
        WEIGHT
    }

    ComparisonType comparisonType;

    public PersonComparator(ComparisonType comparisonType) {
        this.comparisonType = comparisonType;
    }

    public static void main(String[] args) {

        PersonComparator personComparator = new PersonComparator(ComparisonType.WEIGHT);

        Set<Person> people = new TreeSet<>(personComparator);
        people.add(new Person("Barbara", "Szczypior", 1993, 157, 67));
        people.add(new Person("Keanu", "Reeves", 1000, 186, 57));
        people.add(new Person("Tommy", "Wiseau", 1200, 174, 70));
        people.add(new Person("Dua", "Lipa", 0, 173, 58));
        people.add(new Person("Will", "Smith", 9000, 188, 71));

        for (Person per : people) {
            System.out.println("Hello I'm " + per.getName() + " born on " +
                    per.getBirthYear() + ", " + per.getHeight() + "cm tall, and I weigh " + per.getWeight() + "kg.");
        }
    }

        @Override
        public int compare (Person o1, Person o2){
            if (comparisonType != null) {
                switch (comparisonType) {
                    case HEIGHT:
                        return Integer.compare(o1.height, o2.height);

                    case WEIGHT:
                        return Integer.compare(o1.weight, o2.weight);
                }
            }
            return Integer.compare(o1.birthYear, o2.birthYear);
        }
    }